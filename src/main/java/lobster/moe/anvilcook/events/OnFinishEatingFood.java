package lobster.moe.anvilcook.events;

import java.util.HashMap;
import java.util.Map;
import lobster.moe.anvilcook.events.effects.Acid;
import lobster.moe.anvilcook.events.effects.FoodType;
import lobster.moe.anvilcook.events.effects.Fruit;
import lobster.moe.anvilcook.events.effects.Hot;
import lobster.moe.anvilcook.events.effects.Luxurious;
import lobster.moe.anvilcook.events.effects.Meat;
import lobster.moe.anvilcook.events.effects.Nut;
import lobster.moe.anvilcook.events.effects.Poison;
import lobster.moe.anvilcook.events.effects.Satiety;
import lobster.moe.anvilcook.events.effects.Seafood;
import lobster.moe.anvilcook.events.effects.Sweet;
import lobster.moe.anvilcook.events.effects.Unbelievable;
import lobster.moe.anvilcook.tag.ModFoodTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class OnFinishEatingFood {
    static private final Map<TagKey<Item>, FoodType> foodTypeMap = initFoodTypeMap();
    private static Map<TagKey<Item>, FoodType> initFoodTypeMap() {
        Map<TagKey<Item>, FoodType> foodTypeMap = new HashMap<>();
        foodTypeMap.put(ModFoodTags.SWEET, new Sweet());
        foodTypeMap.put(ModFoodTags.HOT, new Hot());
        foodTypeMap.put(ModFoodTags.NUT, new Nut());
        foodTypeMap.put(ModFoodTags.SATIETY, new Satiety());
        foodTypeMap.put(ModFoodTags.MEAT, new Meat());
        foodTypeMap.put(ModFoodTags.SEAFOOD, new Seafood());
        foodTypeMap.put(ModFoodTags.UNBELIEVABLE, new Unbelievable());
        foodTypeMap.put(ModFoodTags.LUXURIOUS, new Luxurious());
        foodTypeMap.put(ModFoodTags.POISON, new Poison());
        foodTypeMap.put(ModFoodTags.FRUIT, new Fruit());
        foodTypeMap.put(ModFoodTags.ACID, new Acid());
        return foodTypeMap;
    }
    public static void FinishEating(ItemStack itemStack, Level level, LivingEntity livingEntity){
        if (itemStack.isEdible()&&livingEntity instanceof ServerPlayer player){
            for (TagKey<Item> itemTagKey : itemStack.getTags().toList()) {
                if (foodTypeMap.containsKey(itemTagKey)) {
                    FoodType foodType = foodTypeMap.get(itemTagKey);
                    foodType.effect(itemStack, player, level);
                    foodType.addCounter(player);
                }
            }
        }
    }
}

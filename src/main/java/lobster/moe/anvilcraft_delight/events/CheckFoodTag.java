package lobster.moe.anvilcraft_delight.events;

import lobster.moe.anvilcraft_delight.tag.ModFoodTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;


public class CheckFoodTag {
    public static void FinishEating(ItemStack itemStack, Level level, LivingEntity livingEntity){
        if (itemStack.isEdible()&&livingEntity instanceof Player player){
            FoodTagCounter.Counter(itemStack,level,player);
            FoodEffectGiver.EffectGiver(itemStack,level,player);
        }
    }
}

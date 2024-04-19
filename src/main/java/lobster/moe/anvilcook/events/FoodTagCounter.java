package lobster.moe.anvilcook.events;

import lobster.moe.anvilcook.init.ModPlayerStatistics;
import lobster.moe.anvilcook.tag.ModFoodTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class FoodTagCounter {
    public static final int judgenum = 4;
    public static void Counter(ItemStack itemStack, Level level, Player player){
        if(player instanceof ServerPlayer serverPlayer){
            addCounter(itemStack,level,ModFoodTags.SWEET,serverPlayer,ModPlayerStatistics.SWEETCOUNTER,ModPlayerStatistics.SWEETJUDGE);
            addCounter(itemStack,level,ModFoodTags.ACID,serverPlayer,ModPlayerStatistics.ACIDCOUNTER,ModPlayerStatistics.ACIDJUDGE);
            addCounter(itemStack,level,ModFoodTags.HOT,serverPlayer,ModPlayerStatistics.HOTCOUNTER,ModPlayerStatistics.HOTJUDGE);
            addCounter(itemStack,level,ModFoodTags.NUT,serverPlayer,ModPlayerStatistics.NUTCOUNTER,ModPlayerStatistics.NUTJUDGE);
            addCounter(itemStack,level,ModFoodTags.SATIETY,serverPlayer,ModPlayerStatistics.SATIETYCOUNTER,ModPlayerStatistics.SATIETYJUDGE);
            addCounter(itemStack,level,ModFoodTags.FRUIT,serverPlayer,ModPlayerStatistics.FRUITCOUNTER,ModPlayerStatistics.FRUITJUDGE);
            addCounter(itemStack,level,ModFoodTags.MEAT,serverPlayer,ModPlayerStatistics.MEATCOUNTER,ModPlayerStatistics.MEATJUDGE);
            addCounter(itemStack,level,ModFoodTags.SEAFOOD,serverPlayer,ModPlayerStatistics.SEAFOODCOUNTER,ModPlayerStatistics.SEAFOODJUDGE);
            addCounter(itemStack,level,ModFoodTags.UNBELIEVABLE,serverPlayer,ModPlayerStatistics.UNBELIEVABLECOUNTER,ModPlayerStatistics.UNBELIEVABLEJUDGE);
            addCounter(itemStack,level,ModFoodTags.LUXURIOUS,serverPlayer,ModPlayerStatistics.LUXURIOUSCOUNTER,ModPlayerStatistics.LUXURIOUSJUDGE);
            addCounter(itemStack,level,ModFoodTags.POISON,serverPlayer,ModPlayerStatistics.POISONCOUNTER,ModPlayerStatistics.POISONJUDGE);
        }
    }
    private static void addCounter(ItemStack itemStack,Level level, TagKey<Item> tagKey, ServerPlayer serverPlayer, ResourceLocation resourceLocation, ResourceLocation resourceLocation2){
        if (itemStack.is(tagKey)){
            serverPlayer.awardStat(resourceLocation,1);
            int sweetcounter = serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation);
            if (sweetcounter>=judgenum && serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation2)==0){
                Random RANDOM = new Random();
                if (RANDOM.nextDouble()>=0.5){
                    serverPlayer.awardStat(resourceLocation2,1);
                }else {
                    serverPlayer.awardStat(resourceLocation2,2);
                }
            }
        }
    }
}

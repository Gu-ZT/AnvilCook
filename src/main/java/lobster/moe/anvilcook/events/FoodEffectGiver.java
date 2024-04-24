package lobster.moe.anvilcook.events;

import lobster.moe.anvilcook.events.effects.*;
import lobster.moe.anvilcook.init.ModPlayerStatistics;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FoodEffectGiver {
    public static void EffectGiver(ItemStack itemStack, Level level, Player player){
        if(player instanceof ServerPlayer serverPlayer){
            Sweet.sweetEffect(itemStack,level,serverPlayer,ModPlayerStatistics.SWEETJUDGE,ModPlayerStatistics.SWEETCOUNTER);
            Acid.acidEffect(itemStack,level,serverPlayer,ModPlayerStatistics.ACIDJUDGE,ModPlayerStatistics.ACIDCOUNTER);
            Nut.nutEffect(itemStack,level,serverPlayer,ModPlayerStatistics.NUTJUDGE,ModPlayerStatistics.NUTCOUNTER);
            Satiety.satietyEffect(itemStack,level,serverPlayer, ModPlayerStatistics.SATIETYJUDGE,ModPlayerStatistics.SATIETYCOUNTER);
            Fruit.fruitEffect(itemStack,level,serverPlayer,ModPlayerStatistics.FRUITJUDGE,ModPlayerStatistics.FRUITCOUNTER);
            Meat.meatEffect(itemStack,level,serverPlayer,ModPlayerStatistics.MEATJUDGE,ModPlayerStatistics.MEATCOUNTER);
            Seafood.seafoodEffect(itemStack,level,serverPlayer,ModPlayerStatistics.SEAFOODJUDGE,ModPlayerStatistics.SEAFOODCOUNTER);
            Unbelievable.unbelievableEffect(itemStack,level,serverPlayer,ModPlayerStatistics.UNBELIEVABLEJUDGE,ModPlayerStatistics.UNBELIEVABLECOUNTER);
            Luxurious.luxuriousEffect(itemStack,level,serverPlayer,ModPlayerStatistics.LUXURIOUSJUDGE,ModPlayerStatistics.LUXURIOUSCOUNTER);
            Hot.hotEffect(itemStack,level,serverPlayer,ModPlayerStatistics.HOTJUDGE,ModPlayerStatistics.HOTCOUNTER);
            Poison.poisonEffect(itemStack,level,serverPlayer,ModPlayerStatistics.POISONJUDGE,ModPlayerStatistics.POISONCOUNTER);
        }
    }

}

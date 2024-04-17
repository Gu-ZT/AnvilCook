package lobster.moe.anvilcraft_delight.events;

import lobster.moe.anvilcraft_delight.events.effects.*;
import lobster.moe.anvilcraft_delight.init.ModPlayerStatistics;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FoodEffectGiver {
    public static void EffectGiver(ItemStack itemStack, Level level, Player player){
        if(player instanceof ServerPlayer serverPlayer){
            Sweet.sweetEffect(itemStack,level,serverPlayer,ModPlayerStatistics.SWEETJUDGE);
            Acid.acidEffect(itemStack,level,serverPlayer,ModPlayerStatistics.ACIDJUDGE);
            Nut.nutEffect(itemStack,level,serverPlayer,ModPlayerStatistics.NUTJUDGE);
            Satiety.satietyEffect(itemStack,level,serverPlayer, ModPlayerStatistics.SATIETYJUDGE);
            Fruit.fruitEffect(itemStack,level,serverPlayer,ModPlayerStatistics.FRUITJUDGE);
            Meat.meatEffect(itemStack,level,serverPlayer,ModPlayerStatistics.MEATJUDGE);
            Seafood.seafoodEffect(itemStack,level,serverPlayer,ModPlayerStatistics.SEAFOODJUDGE);
            Unbelievable.unbelievableEffect(itemStack,level,serverPlayer,ModPlayerStatistics.UNBELIEVABLEJUDGE);
            Luxurious.luxuriousEffect(itemStack,level,serverPlayer,ModPlayerStatistics.LUXURIOUSJUDGE);
            Hot.hotEffect(itemStack,level,serverPlayer,ModPlayerStatistics.HOTJUDGE);
            Poison.poisonEffect(itemStack,level,serverPlayer,ModPlayerStatistics.POISONJUDGE);
        }
    }

}

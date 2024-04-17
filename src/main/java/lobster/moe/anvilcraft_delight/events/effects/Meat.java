package lobster.moe.anvilcraft_delight.events.effects;

import lobster.moe.anvilcraft_delight.tag.ModFoodTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Meat {
    public static void meatEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation resourceLocation){
        if (itemStack.is(ModFoodTags.MEAT)){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.SATURATION,40,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.HUNGER,20,1));
            }
        }
    }
}

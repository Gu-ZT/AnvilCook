package lobster.moe.anvilcook.events.effects;

import lobster.moe.anvilcook.events.FoodTagCounter;
import lobster.moe.anvilcook.tag.ModFoodTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Satiety {
    public static void satietyEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation resourceLocation,ResourceLocation resourceLocation2){
        if (itemStack.is(ModFoodTags.SATIETY)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation2);
            for (;num>=1;num=num/ FoodTagCounter.judgenum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.SATURATION,10*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.HUNGER,10*l,1));
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,15*l,1));
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,10*l,1));
            }
        }
    }
}

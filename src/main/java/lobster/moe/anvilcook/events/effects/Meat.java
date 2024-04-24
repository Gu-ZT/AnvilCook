package lobster.moe.anvilcook.events.effects;

import lobster.moe.anvilcook.events.FoodTagCounter;
import lobster.moe.anvilcook.events.tag.ModFoodTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Meat {
    public static void meatEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation judge,ResourceLocation counter){
        if (itemStack.is(ModFoodTags.MEAT)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,counter);
            for (;num>=1;num=num/ FoodTagCounter.judgenum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.SATURATION,40*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.HUNGER,20*l,1));
            }
        }
    }
}

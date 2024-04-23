package lobster.moe.anvilcook.events.effects;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Meat implements FoodType{
    @Override
    public void effect(ItemStack itemStack, ServerPlayer serverPlayer, Level level){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.SATURATION,40,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.HUNGER,20,1));
            }

    }

    @Override
    public ResourceLocation getCunterResourceLocation() {
        return null;
    }

    @Override
    public ResourceLocation getjudgeResourceLocation() {
        return null;
    }
}

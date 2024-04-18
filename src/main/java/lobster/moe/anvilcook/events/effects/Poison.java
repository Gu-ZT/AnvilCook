package lobster.moe.anvilcook.events.effects;

import lobster.moe.anvilcook.init.ModPlayerStatistics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Poison implements FoodType{

    @Override
    public void effect(ItemStack itemStack, ServerPlayer serverPlayer, Level level){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION,30,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 5.0f;
                serverPlayer.setHealth(newHealth);
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,40,2));
            }

    }

    @Override
    public ResourceLocation getCunterResourceLocation() {
        return ModPlayerStatistics.POISONCOUNTER;
    }

    @Override
    public ResourceLocation getjudgeResourceLocation() {
        return ModPlayerStatistics.POISONJUDGE;
    }
}

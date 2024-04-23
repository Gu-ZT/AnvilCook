package lobster.moe.anvilcook.events.effects;

import lobster.moe.anvilcook.init.ModPlayerStatistics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Hot implements FoodType{

    @Override
    public void effect(ItemStack itemStack, ServerPlayer serverPlayer, Level level){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,20,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==2){
                MobEffectInstance fireEffect = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 0);
                serverPlayer.addEffect(fireEffect);
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 2.0f;
                serverPlayer.setHealth(newHealth);
            }

    }

    @Override
    public ResourceLocation getCunterResourceLocation() {
        return ModPlayerStatistics.NUTCOUNTER;
    }

    @Override
    public ResourceLocation getjudgeResourceLocation() {
        return ModPlayerStatistics.NUTJUDGE;
    }
}

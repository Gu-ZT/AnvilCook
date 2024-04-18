package lobster.moe.anvilcook.events.effects;

import lobster.moe.anvilcook.tag.ModFoodTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Nut {
    public static void nutEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation resourceLocation){
        if (itemStack.is(ModFoodTags.NUT)){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.SATURATION,5,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 2.0f;
                serverPlayer.setHealth(newHealth);
            }
        }
    }
}

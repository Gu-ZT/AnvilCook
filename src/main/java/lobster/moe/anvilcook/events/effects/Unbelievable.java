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

public class Unbelievable {
    public static void unbelievableEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation judge,ResourceLocation counter){
        if (itemStack.is(ModFoodTags.UNBELIEVABLE)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,counter);
            for (;num>=1;num=num/ FoodTagCounter.judgenum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.LUCK,15*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 9.0f*l;
                serverPlayer.setHealth(newHealth);
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,20*l,1));
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.WITHER,20*l,1));
            }
        }
    }
}

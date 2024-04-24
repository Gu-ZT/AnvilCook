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

public class Poison {
    public static void poisonEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation judge,ResourceLocation counter){
        if (itemStack.is(ModFoodTags.POISON)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,counter);
            for (;num>=1;num=num/ FoodTagCounter.judgenum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION,30*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 5.0f*l;
                serverPlayer.setHealth(newHealth);
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,40*l,2));
            }
        }
    }
}

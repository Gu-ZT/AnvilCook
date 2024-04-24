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

public class Nut {
    public static void nutEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation judge,ResourceLocation counter){
        if (itemStack.is(ModFoodTags.NUT)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,counter);
            for (;num>=1;num=num/ FoodTagCounter.judgenum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.SATURATION,5*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,judge)==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 2.0f*l;
                serverPlayer.setHealth(newHealth);
            }
        }
    }
}

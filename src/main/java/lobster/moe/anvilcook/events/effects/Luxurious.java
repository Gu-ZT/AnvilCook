package lobster.moe.anvilcook.events.effects;

import lobster.moe.anvilcook.events.FoodTagCounter;
import lobster.moe.anvilcook.tag.ModFoodTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Random;

public class Luxurious {
    public static void luxuriousEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation resourceLocation,ResourceLocation resourceLocation2){
        if (itemStack.is(ModFoodTags.LUXURIOUS)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation2);
            for (;num>=1;num=num/ FoodTagCounter.judgenum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.LUCK,5*l,1));
                Random RANDOM = new Random();
                if (RANDOM.nextDouble() <= 0.05*l) {
                    ItemStack goldIngotStack = new ItemStack(Items.DIAMOND);
                    ItemEntity goldIngotEntity = new ItemEntity(level, serverPlayer.xOld, serverPlayer.yOld, serverPlayer.zOld, goldIngotStack);
                    level.addFreshEntity(goldIngotEntity);
                }
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,5*l,1));
            }
        }
    }
}

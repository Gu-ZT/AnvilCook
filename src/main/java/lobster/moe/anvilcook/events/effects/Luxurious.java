package lobster.moe.anvilcook.events.effects;

import java.util.Random;
import lobster.moe.anvilcook.init.ModPlayerStatistics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class Luxurious implements FoodType{


    @Override
    public void effect(ItemStack itemStack, ServerPlayer serverPlayer, Level level){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.LUCK,5,1));
                Random RANDOM = new Random();
                if (RANDOM.nextDouble() <= 0.05) {
                    ItemStack goldIngotStack = new ItemStack(Items.DIAMOND);
                    ItemEntity goldIngotEntity = new ItemEntity(level, serverPlayer.xOld, serverPlayer.yOld, serverPlayer.zOld, goldIngotStack);
                    level.addFreshEntity(goldIngotEntity);
                }
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation())==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,5,1));
            }

    }

    @Override
    public ResourceLocation getCunterResourceLocation() {
        return ModPlayerStatistics.LUXURIOUSCOUNTER;
    }

    @Override
    public ResourceLocation getjudgeResourceLocation() {
        return ModPlayerStatistics.LUXURIOUSJUDGE;
    }
}

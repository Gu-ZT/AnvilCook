package lobster.moe.anvilcraft_delight.events.effects;

import lobster.moe.anvilcraft_delight.tag.ModFoodTags;
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
    public static void luxuriousEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation resourceLocation){
        if (itemStack.is(ModFoodTags.LUXURIOUS)){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.LUCK,5,1));
                Random RANDOM = new Random();
                if (RANDOM.nextDouble() <= 0.05) {
                    ItemStack goldIngotStack = new ItemStack(Items.DIAMOND);
                    ItemEntity goldIngotEntity = new ItemEntity(level, serverPlayer.xOld, serverPlayer.yOld, serverPlayer.zOld, goldIngotStack);
                    level.addFreshEntity(goldIngotEntity);
                }
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.CONFUSION,5,1));
            }
        }
    }
}

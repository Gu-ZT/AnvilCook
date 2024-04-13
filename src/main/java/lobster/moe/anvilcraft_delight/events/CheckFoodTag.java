package lobster.moe.anvilcraft_delight.events;

import lobster.moe.anvilcraft_delight.tag.ModFoodTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

import java.util.Random;

public class CheckFoodTag {
    public static void FinishEating(ItemStack itemStack, Level level, LivingEntity livingEntity){
        if (itemStack.isEdible()){
            if (itemStack.is(ModFoodTags.SWEET)){
                float i=livingEntity.getHealth();
                livingEntity.setHealth(i+1f);
            }
            if (itemStack.is(ModFoodTags.ACID)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,5,2));
            }
            if (itemStack.is(ModFoodTags.NUT)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.SATURATION,5,1));
            }
            if (itemStack.is(ModFoodTags.HOT)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,20,2));
            }
            if (itemStack.is(ModFoodTags.SATIETY)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.SATURATION,20,1));
            }
            if (itemStack.is(ModFoodTags.FRUIT)){
                float i=livingEntity.getHealth();
                livingEntity.setHealth(i+1f);
            }
            if (itemStack.is(ModFoodTags.MEAT)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER,20,1));
            }
            if (itemStack.is(ModFoodTags.SEAFOOD)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING,100,1));
            }
            if (itemStack.is(ModFoodTags.UNBELIEVABLE)){
                livingEntity.addEffect(new MobEffectInstance(MobEffects.LUCK,20,1));
            }
            if (itemStack.is(ModFoodTags.LUXURIOUS)){
                Random RANDOM = new Random();
                if (RANDOM.nextDouble() <= 0.05) {
                    ItemStack goldIngotStack = new ItemStack(Items.GOLD_INGOT);
                    ItemEntity goldIngotEntity = new ItemEntity(level, livingEntity.xOld, livingEntity.yOld, livingEntity.zOld, goldIngotStack);
                    level.addFreshEntity(goldIngotEntity);
                }
            }

        }
    }
}

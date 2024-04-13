package lobster.moe.anvilcraft_delight.Mixin;

import lobster.moe.anvilcraft_delight.events.CheckFoodTag;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ModFoodItem {
    @Inject(method = "finishUsingItem",at = @At("HEAD"))
    private void finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity, CallbackInfoReturnable<ItemStack> cir){
        CheckFoodTag.FinishEating(itemStack,level,livingEntity);
    }
}

package lobster.moe.anvilcraft_delight;

import com.mojang.logging.LogUtils;
import dev.dubhe.anvilcraft.api.log.Logger;
import lobster.moe.anvilcraft_delight.init.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class AnvilCraft_Delight implements ModInitializer {
    public static final String MOD_ID = "anvilcraft_delight";
    public static final Logger LOGGER = new Logger(LogUtils.getLogger());

    @Override
    public void onInitialize() {
        ModTrees.register();
        ModBlock.register();
        ModItems.register();
        ModMushroom.register();
        ModCereals.register();
        ModVegetable.register();
        ModFruit.register();
        ModJams.register();
        ModItemGroup.register();
    }
    public static @NotNull ResourceLocation of(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
}

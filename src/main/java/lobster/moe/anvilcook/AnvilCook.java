package lobster.moe.anvilcook;

import lobster.moe.anvilcook.init.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class AnvilCook implements ModInitializer {
    public static final String MOD_ID = "anvilcook";
//    public static final Logger LOGGER = new Logger(LogUtils.getLogger());

    @Override
    public void onInitialize() {
        ModTrees.register();
        ModWood.register();
        ModItems.register();
        ModMushroom.register();
        ModCereals.register();
        ModVegetable.register();
        ModFruit.register();
        ModJams.register();
//        ModSeeds.register();
        ModCrops.register();
        ModItemGroup.register();
        ModPlayerStatistics.register();
    }
    public static @NotNull ResourceLocation of(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
}

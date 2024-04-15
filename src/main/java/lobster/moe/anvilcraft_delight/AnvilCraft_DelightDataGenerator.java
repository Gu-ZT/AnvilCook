package lobster.moe.anvilcraft_delight;

import lobster.moe.anvilcraft_delight.datagen.*;
import lobster.moe.anvilcraft_delight.features.ModTreeFeatures;
import lobster.moe.anvilcraft_delight.features.ModTreePlacements;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class AnvilCraft_DelightDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelsProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModGenerator::new);

    }
    @Override
    public void buildRegistry(RegistrySetBuilder RegistryBuilder){
        RegistryBuilder.add(Registries.CONFIGURED_FEATURE, ModTreeFeatures::bootstrap);
        RegistryBuilder.add(Registries.PLACED_FEATURE, ModTreePlacements::bootstrap);
    }
}

package lobster.moe.anvilcook;

import lobster.moe.anvilcook.datagen.*;
import lobster.moe.anvilcook.features.ModTreeFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class AnvilCookDataGenerator implements DataGeneratorEntrypoint {

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
    }
}

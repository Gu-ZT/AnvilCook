package lobster.moe.anvilcraft_delight.datagen;

import lobster.moe.anvilcraft_delight.init.ModBlock;
import lobster.moe.anvilcraft_delight.init.ModTrees;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.woodProvider(ModBlock.PEARLOG).log(ModBlock.PEARLOG).wood(ModBlock.PEARWOOD);
        blockStateModelGenerator.woodProvider(ModBlock.LEMONLOG).log(ModBlock.LEMONLOG).wood(ModBlock.LEMONWOOD);
        blockStateModelGenerator.woodProvider(ModBlock.WALNUTLOG).log(ModBlock.WALNUTLOG).wood(ModBlock.WALNUTWOOD);
        blockStateModelGenerator.woodProvider(ModBlock.BANANALOG).log(ModBlock.BANANALOG).wood(ModBlock.BANANAWOOD);
        blockStateModelGenerator.woodProvider(ModBlock.PEACHLOG).log(ModBlock.PEACHLOG).wood(ModBlock.PEACHWOOD);
        blockStateModelGenerator.woodProvider(ModBlock.COCONUTLOG).log(ModBlock.COCONUTLOG).wood(ModBlock.COCONUTWOOD);
        blockStateModelGenerator.woodProvider(ModBlock.CARAMBOLALOG).log(ModBlock.CARAMBOLALOG).wood(ModBlock.CARAMBOLAWOOD);
        blockStateModelGenerator.woodProvider(ModBlock.TOONLOG).log(ModBlock.TOONLOG).wood(ModBlock.TOONWOOD);


        blockStateModelGenerator.createTrivialCube(ModBlock.PEARLEAVES);
        blockStateModelGenerator.createTrivialCube(ModBlock.LEMONLEAVES);
        blockStateModelGenerator.createTrivialCube(ModBlock.WALNUTLEAVES);
        blockStateModelGenerator.createTrivialCube(ModBlock.BANANALEAVES);
        blockStateModelGenerator.createTrivialCube(ModBlock.PEACHLEAVES);
        blockStateModelGenerator.createTrivialCube(ModBlock.COCONUTLEAVES);
        blockStateModelGenerator.createTrivialCube(ModBlock.CARAMBOLALEAVES);
        blockStateModelGenerator.createTrivialCube(ModBlock.TOONLEAVES);

        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.PEARSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.LEMONSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.WALNUTSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.BANANASAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.PEACHSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.COCONUTSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.CARAMBOLASAPLING,BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlockWithDefaultItem(ModTrees.TOONSAPLING,BlockModelGenerators.TintState.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}

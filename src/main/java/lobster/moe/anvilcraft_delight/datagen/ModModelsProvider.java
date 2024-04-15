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
        BlockModelGenerators.BlockFamilyProvider PEARFAMILY = blockStateModelGenerator.family(ModBlock.PEARPLANKS);
        BlockModelGenerators.BlockFamilyProvider LEMONFAMILY = blockStateModelGenerator.family(ModBlock.LEMONPLANKS);
        BlockModelGenerators.BlockFamilyProvider WALNUTFAMILY = blockStateModelGenerator.family(ModBlock.WALNUTPLANKS);
        BlockModelGenerators.BlockFamilyProvider BANANAFAMILY = blockStateModelGenerator.family(ModBlock.BANANAPLANKS);
        BlockModelGenerators.BlockFamilyProvider PEACHFAMILY = blockStateModelGenerator.family(ModBlock.PEACHPLANKS);
        BlockModelGenerators.BlockFamilyProvider COCONUTFAMILY = blockStateModelGenerator.family(ModBlock.COCONUTPLANKS);
        BlockModelGenerators.BlockFamilyProvider CARAMBOLAFAMILY = blockStateModelGenerator.family(ModBlock.CARAMBOLAPLANKS);
        BlockModelGenerators.BlockFamilyProvider TOONFAMILY = blockStateModelGenerator.family(ModBlock.TOONPLANKS);


        PEARFAMILY.stairs(ModBlock.PEARSTAIRS);
        PEARFAMILY.slab(ModBlock.PEARSLAB);
        PEARFAMILY.button(ModBlock.PEARBUTTON);
        PEARFAMILY.pressurePlate(ModBlock.PEARPRESSUERPLATE);
        PEARFAMILY.fence(ModBlock.PEARFENCE);
        PEARFAMILY.fenceGate(ModBlock.PEARFENCEGATE);
        PEARFAMILY.wall(ModBlock.PEARWALL);
        blockStateModelGenerator.createDoor(ModBlock.PEARDOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.PEARTRAPDOOR);

        LEMONFAMILY.stairs(ModBlock.LEMONSTAIRS);
        LEMONFAMILY.slab(ModBlock.LEMONSLAB);
        LEMONFAMILY.button(ModBlock.LEMONBUTTON);
        LEMONFAMILY.pressurePlate(ModBlock.LEMONPRESSUERPLATE);
        LEMONFAMILY.fence(ModBlock.LEMONFENCE);
        LEMONFAMILY.fenceGate(ModBlock.LEMONFENCEGATE);
        LEMONFAMILY.wall(ModBlock.LEMONWALL);
        blockStateModelGenerator.createDoor(ModBlock.LEMONDOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.LEMONTRAPDOOR);

        WALNUTFAMILY.stairs(ModBlock.WALNUTSTAIRS);
        WALNUTFAMILY.slab(ModBlock.WALNUTSLAB);
        WALNUTFAMILY.button(ModBlock.WALNUTBUTTON);
        WALNUTFAMILY.pressurePlate(ModBlock.WALNUTPRESSUERPLATE);
        WALNUTFAMILY.fence(ModBlock.WALNUTFENCE);
        WALNUTFAMILY.fenceGate(ModBlock.WALNUTFENCEGATE);
        WALNUTFAMILY.wall(ModBlock.WALNUTWALL);
        blockStateModelGenerator.createDoor(ModBlock.WALNUTDOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.WALNUTTRAPDOOR);

        BANANAFAMILY.stairs(ModBlock.BANANASTAIRS);
        BANANAFAMILY.slab(ModBlock.BANANASLAB);
        BANANAFAMILY.button(ModBlock.BANANABUTTON);
        BANANAFAMILY.pressurePlate(ModBlock.BANANAPRESSUERPLATE);
        BANANAFAMILY.fence(ModBlock.BANANAFENCE);
        BANANAFAMILY.fenceGate(ModBlock.BANANAFENCEGATE);
        BANANAFAMILY.wall(ModBlock.BANANAWALL);
        blockStateModelGenerator.createDoor(ModBlock.BANANADOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.BANANATRAPDOOR);

        PEACHFAMILY.stairs(ModBlock.PEACHSTAIRS);
        PEACHFAMILY.slab(ModBlock.PEACHSLAB);
        PEACHFAMILY.button(ModBlock.PEACHBUTTON);
        PEACHFAMILY.pressurePlate(ModBlock.PEACHPRESSUERPLATE);
        PEACHFAMILY.fence(ModBlock.PEACHFENCE);
        PEACHFAMILY.fenceGate(ModBlock.PEACHFENCEGATE);
        PEACHFAMILY.wall(ModBlock.PEACHWALL);
        blockStateModelGenerator.createDoor(ModBlock.PEACHDOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.PEACHTRAPDOOR);

        COCONUTFAMILY.stairs(ModBlock.COCONUTSTAIRS);
        COCONUTFAMILY.slab(ModBlock.COCONUTSLAB);
        COCONUTFAMILY.button(ModBlock.COCONUTBUTTON);
        COCONUTFAMILY.pressurePlate(ModBlock.COCONUTPRESSUERPLATE);
        COCONUTFAMILY.fence(ModBlock.COCONUTFENCE);
        COCONUTFAMILY.fenceGate(ModBlock.COCONUTFENCEGATE);
        COCONUTFAMILY.wall(ModBlock.COCONUTWALL);
        blockStateModelGenerator.createDoor(ModBlock.COCONUTDOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.COCONUTTRAPDOOR);

        CARAMBOLAFAMILY.stairs(ModBlock.CARAMBOLASTAIRS);
        CARAMBOLAFAMILY.slab(ModBlock.CARAMBOLASLAB);
        CARAMBOLAFAMILY.button(ModBlock.CARAMBOLABUTTON);
        CARAMBOLAFAMILY.pressurePlate(ModBlock.CARAMBOLAPRESSUERPLATE);
        CARAMBOLAFAMILY.fence(ModBlock.CARAMBOLAFENCE);
        CARAMBOLAFAMILY.fenceGate(ModBlock.CARAMBOLAFENCEGATE);
        CARAMBOLAFAMILY.wall(ModBlock.CARAMBOLAWALL);
        blockStateModelGenerator.createDoor(ModBlock.CARAMBOLADOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.CARAMBOLATRAPDOOR);

        TOONFAMILY.stairs(ModBlock.TOONSTAIRS);
        TOONFAMILY.slab(ModBlock.TOONSLAB);
        TOONFAMILY.button(ModBlock.TOONBUTTON);
        TOONFAMILY.pressurePlate(ModBlock.TOONPRESSUERPLATE);
        TOONFAMILY.fence(ModBlock.TOONFENCE);
        TOONFAMILY.fenceGate(ModBlock.TOONFENCEGATE);
        TOONFAMILY.wall(ModBlock.TOONWALL);
        blockStateModelGenerator.createDoor(ModBlock.TOONDOOR);
        blockStateModelGenerator.createTrapdoor(ModBlock.TOONTRAPDOOR);



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

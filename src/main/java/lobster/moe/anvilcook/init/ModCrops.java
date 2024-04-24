package lobster.moe.anvilcook.init;

import lobster.moe.anvilcook.AnvilCook;
import lobster.moe.anvilcook.block.type.Blueberry;
import lobster.moe.anvilcook.block.type.Strawberry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModCrops {
    private static final Map<String, Block> BLOCK_MAP = new HashMap<>();

    public static final Block STRAWBERYCROP = registerBlock("strawberry_crop", Strawberry::new,BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH));
    public static final Block BLUEBERYCROP = registerBlock("blueberry_crop", Blueberry::new,BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH));








    public static void register() {
        for (Map.Entry<String, Block> entry : ModCrops.BLOCK_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.BLOCK, AnvilCook.of(entry.getKey()), entry.getValue());
        }
    }

    private static Block registerBlock(String id, @NotNull Function<BlockBehaviour.Properties, Block> blockCreator, BlockBehaviour.Properties properties) {
        Block block = blockCreator.apply(properties);
        BLOCK_MAP.put(id, block);
        return block;
    }
}

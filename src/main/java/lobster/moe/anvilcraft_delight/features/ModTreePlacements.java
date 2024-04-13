package lobster.moe.anvilcraft_delight.features;

import dev.architectury.platform.Mod;
import lobster.moe.anvilcraft_delight.AnvilCraft_Delight;
import lobster.moe.anvilcraft_delight.init.ModBlock;
import lobster.moe.anvilcraft_delight.init.ModTrees;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModTreePlacements {
//    public static final ResourceKey<PlacedFeature> PEARTREEPLACED = ModTreePlacements.createKey("pear_tree_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> bootstapContext) {
//        register(bootstapContext,PEARTREEPLACED,bootstapContext.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(ModTreeFeatures.PEARTREE),
//                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2,0.1f,2),
//                        ModTrees.PEARSAPLING));
    }

    public static ResourceKey<PlacedFeature> createKey(String string) {
        return ResourceKey.create(Registries.PLACED_FEATURE, AnvilCraft_Delight.of(string));
    }

    public static void register(BootstapContext<PlacedFeature> bootstapContext, ResourceKey<PlacedFeature> resourceKey, Holder<ConfiguredFeature<?, ?>> holder, List<PlacementModifier> list) {
        bootstapContext.register(resourceKey, new PlacedFeature(holder, List.copyOf(list)));
    }
}
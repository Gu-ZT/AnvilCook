package lobster.moe.anvilcraft_delight.init;

import dev.architectury.platform.Mod;
import lobster.moe.anvilcraft_delight.AnvilCraft_Delight;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ModItems {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item PEARLOG = registerBlock(ModBlock.PEARLOG, BlockItem::new,defaultProperties());
    public static final Item PEARWOOD = registerBlock(ModBlock.PEARWOOD, BlockItem::new,defaultProperties());
    public static final Item PEARLEAVES = registerBlock(ModBlock.PEARLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEARSAPLING = registerBlock(ModTrees.PEARSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEARPLANKS = registerBlock(ModBlock.PEARPLANKS,BlockItem::new,defaultProperties());

    public static final Item LEMONLOG = registerBlock(ModBlock.LEMONLOG,BlockItem::new,defaultProperties());
    public static final Item LEMONWOOD = registerBlock(ModBlock.LEMONWOOD,BlockItem::new,defaultProperties());
    public static final Item LEMONLEAVES = registerBlock(ModBlock.LEMONLEAVES,BlockItem::new,defaultProperties());
    public static final Item LEMONSAPLING = registerBlock(ModTrees.LEMONSAPLING,BlockItem::new,defaultProperties());
    public static final Item LEMONPLANKS = registerBlock(ModBlock.LEMONPLANKS,BlockItem::new,defaultProperties());


    public static final Item WALNUTLOG = registerBlock(ModBlock.WALNUTLOG,BlockItem::new,defaultProperties());
    public static final Item WALNUTWOOD = registerBlock(ModBlock.WALNUTWOOD,BlockItem::new,defaultProperties());
    public static final Item WALNUTLEAVES = registerBlock(ModBlock.WALNUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item WALNUTSAPLING = registerBlock(ModTrees.WALNUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item WALNUTPLANKS = registerBlock(ModBlock.WALNUTPLANKS,BlockItem::new,defaultProperties());


    public static final Item BANANALOG = registerBlock(ModBlock.BANANALOG,BlockItem::new,defaultProperties());
    public static final Item BANANAWOOD = registerBlock(ModBlock.BANANAWOOD,BlockItem::new,defaultProperties());
    public static final Item BANANALEAVES = registerBlock(ModBlock.BANANALEAVES,BlockItem::new,defaultProperties());
    public static final Item BANANASAPLING = registerBlock(ModTrees.BANANASAPLING,BlockItem::new,defaultProperties());
    public static final Item BANANAPLANKS = registerBlock(ModBlock.BANANAPLANKS,BlockItem::new,defaultProperties());


    public static final Item PEACHLOG = registerBlock(ModBlock.PEACHLOG,BlockItem::new,defaultProperties());
    public static final Item PEACHWOOD = registerBlock(ModBlock.PEACHWOOD,BlockItem::new,defaultProperties());
    public static final Item PEACHLEAVES = registerBlock(ModBlock.PEACHLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEACHSAPLING = registerBlock(ModTrees.PEACHSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEACHPLANKS = registerBlock(ModBlock.PEACHPLANKS,BlockItem::new,defaultProperties());


    public static final Item COCONUTLOG = registerBlock(ModBlock.COCONUTLOG,BlockItem::new,defaultProperties());
    public static final Item COCONUTWOOD = registerBlock(ModBlock.COCONUTWOOD,BlockItem::new,defaultProperties());
    public static final Item COCONUTLEAVES = registerBlock(ModBlock.COCONUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item COCONUTSAPLING = registerBlock(ModTrees.COCONUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item COCONUTPLANKS = registerBlock(ModBlock.COCONUTPLANKS,BlockItem::new,defaultProperties());


    public static final Item CARAMBOLALOG = registerBlock(ModBlock.CARAMBOLALOG,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAWOOD = registerBlock(ModBlock.CARAMBOLAWOOD,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLALEAVES = registerBlock(ModBlock.CARAMBOLALEAVES,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASAPLING = registerBlock(ModTrees.CARAMBOLASAPLING,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAPLANKS = registerBlock(ModBlock.CARAMBOLAPLANKS,BlockItem::new,defaultProperties());


    public static final Item TOONLOG = registerBlock(ModBlock.TOONLOG,BlockItem::new,defaultProperties());
    public static final Item TOONWOOD = registerBlock(ModBlock.TOONWOOD,BlockItem::new,defaultProperties());
    public static final Item TOONLEAVES = registerBlock(ModBlock.TOONLEAVES,BlockItem::new,defaultProperties());
    public static final Item TOONASAPLING = registerBlock(ModTrees.TOONSAPLING,BlockItem::new,defaultProperties());
    public static final Item TOONPLANKS = registerBlock(ModBlock.TOONPLANKS,BlockItem::new,defaultProperties());






    private static Item registerBlock(Block block, @NotNull BiFunction<Block, Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(block, properties);
        ITEM_MAP.put(BuiltInRegistries.BLOCK.getKey(block).getPath(), item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModItems.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCraft_Delight.of(entry.getKey()), entry.getValue());
        }
    }
}

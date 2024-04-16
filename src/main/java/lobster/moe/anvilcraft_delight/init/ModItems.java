package lobster.moe.anvilcraft_delight.init;

import lobster.moe.anvilcraft_delight.AnvilCraft_Delight;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ModItems {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public static final Item APPLELOG = registerBlock(ModBlock.APPLELOG, BlockItem::new,defaultProperties());
    public static final Item APPLEWOOD = registerBlock(ModBlock.APPLEWOOD, BlockItem::new,defaultProperties());
    public static final Item APPLELEAVES = registerBlock(ModBlock.APPLELEAVES,BlockItem::new,defaultProperties());
    public static final Item APPLESAPLING = registerBlock(ModTrees.APPLESAPLING,BlockItem::new,defaultProperties());
    public static final Item APPLEPLANKS = registerBlock(ModBlock.APPLEPLANKS,BlockItem::new,defaultProperties());
    public static final Item APPLESTAIRS = registerBlock(ModBlock.APPLESTAIRS,BlockItem::new,defaultProperties());
    public static final Item APPLESLAB = registerBlock(ModBlock.APPLESLAB,BlockItem::new,defaultProperties());
    public static final Item APPLEBUTTON = registerBlock(ModBlock.APPLEBUTTON,BlockItem::new,defaultProperties());
    public static final Item APPLEPRESSUERPLATE = registerBlock(ModBlock.APPLEPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item APPLEFENCE = registerBlock(ModBlock.APPLEFENCE,BlockItem::new,defaultProperties());
    public static final Item APPLEFENCEGATE = registerBlock(ModBlock.APPLEFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item APPLEDOOR = registerBlock(ModBlock.APPLEDOOR,BlockItem::new,defaultProperties());
    public static final Item APPLETRAPDOOR = registerBlock(ModBlock.APPLETRAPDOOR,BlockItem::new,defaultProperties());



    public static final Item PEARLOG = registerBlock(ModBlock.PEARLOG, BlockItem::new,defaultProperties());
    public static final Item PEARWOOD = registerBlock(ModBlock.PEARWOOD, BlockItem::new,defaultProperties());
    public static final Item PEARLEAVES = registerBlock(ModBlock.PEARLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEARSAPLING = registerBlock(ModTrees.PEARSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEARPLANKS = registerBlock(ModBlock.PEARPLANKS,BlockItem::new,defaultProperties());
    public static final Item PEARSTAIRS = registerBlock(ModBlock.PEARSTAIRS,BlockItem::new,defaultProperties());
    public static final Item PEARSLAB = registerBlock(ModBlock.PEARSLAB,BlockItem::new,defaultProperties());
    public static final Item PEARBUTTON = registerBlock(ModBlock.PEARBUTTON,BlockItem::new,defaultProperties());
    public static final Item PEARPRESSUERPLATE = registerBlock(ModBlock.PEARPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item PEARFENCE = registerBlock(ModBlock.PEARFENCE,BlockItem::new,defaultProperties());
    public static final Item PEARFENCEGATE = registerBlock(ModBlock.PEARFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item PEARDOOR = registerBlock(ModBlock.PEARDOOR,BlockItem::new,defaultProperties());
    public static final Item PEARTRAPDOOR = registerBlock(ModBlock.PEARTRAPDOOR,BlockItem::new,defaultProperties());

    public static final Item LEMONLOG = registerBlock(ModBlock.LEMONLOG,BlockItem::new,defaultProperties());
    public static final Item LEMONWOOD = registerBlock(ModBlock.LEMONWOOD,BlockItem::new,defaultProperties());
    public static final Item LEMONLEAVES = registerBlock(ModBlock.LEMONLEAVES,BlockItem::new,defaultProperties());
    public static final Item LEMONSAPLING = registerBlock(ModTrees.LEMONSAPLING,BlockItem::new,defaultProperties());
    public static final Item LEMONPLANKS = registerBlock(ModBlock.LEMONPLANKS,BlockItem::new,defaultProperties());
    public static final Item LEMONSTAIRS = registerBlock(ModBlock.LEMONSTAIRS,BlockItem::new,defaultProperties());
    public static final Item LEMONSLAB = registerBlock(ModBlock.LEMONSLAB,BlockItem::new,defaultProperties());
    public static final Item LEMONBUTTON = registerBlock(ModBlock.LEMONBUTTON,BlockItem::new,defaultProperties());
    public static final Item LEMONPRESSUERPLATE = registerBlock(ModBlock.LEMONPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item LEMONFENCE = registerBlock(ModBlock.LEMONFENCE,BlockItem::new,defaultProperties());
    public static final Item LEMONFENCEGATE = registerBlock(ModBlock.LEMONFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item LEMONDOOR = registerBlock(ModBlock.LEMONDOOR,BlockItem::new,defaultProperties());
    public static final Item LEMONTRAPDOOR = registerBlock(ModBlock.LEMONTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item WALNUTLOG = registerBlock(ModBlock.WALNUTLOG,BlockItem::new,defaultProperties());
    public static final Item WALNUTWOOD = registerBlock(ModBlock.WALNUTWOOD,BlockItem::new,defaultProperties());
    public static final Item WALNUTLEAVES = registerBlock(ModBlock.WALNUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item WALNUTSAPLING = registerBlock(ModTrees.WALNUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item WALNUTPLANKS = registerBlock(ModBlock.WALNUTPLANKS,BlockItem::new,defaultProperties());
    public static final Item WALNUTSTAIRS = registerBlock(ModBlock.WALNUTSTAIRS,BlockItem::new,defaultProperties());
    public static final Item WALNUTSLAB = registerBlock(ModBlock.WALNUTSLAB,BlockItem::new,defaultProperties());
    public static final Item WALNUTBUTTON = registerBlock(ModBlock.WALNUTBUTTON,BlockItem::new,defaultProperties());
    public static final Item WALNUTPRESSUERPLATE = registerBlock(ModBlock.WALNUTPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item WALNUTFENCE = registerBlock(ModBlock.WALNUTFENCE,BlockItem::new,defaultProperties());
    public static final Item WALNUTFENCEGATE = registerBlock(ModBlock.WALNUTFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item WALNUTDOOR = registerBlock(ModBlock.WALNUTDOOR,BlockItem::new,defaultProperties());
    public static final Item WALNUTTRAPDOOR = registerBlock(ModBlock.WALNUTTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item BANANALOG = registerBlock(ModBlock.BANANALOG,BlockItem::new,defaultProperties());
    public static final Item BANANAWOOD = registerBlock(ModBlock.BANANAWOOD,BlockItem::new,defaultProperties());
    public static final Item BANANALEAVES = registerBlock(ModBlock.BANANALEAVES,BlockItem::new,defaultProperties());
    public static final Item BANANASAPLING = registerBlock(ModTrees.BANANASAPLING,BlockItem::new,defaultProperties());
    public static final Item BANANAPLANKS = registerBlock(ModBlock.BANANAPLANKS,BlockItem::new,defaultProperties());
    public static final Item BANANASTAIRS = registerBlock(ModBlock.BANANASTAIRS,BlockItem::new,defaultProperties());
    public static final Item BANANASLAB = registerBlock(ModBlock.BANANASLAB,BlockItem::new,defaultProperties());
    public static final Item BANANABUTTON = registerBlock(ModBlock.BANANABUTTON,BlockItem::new,defaultProperties());
    public static final Item BANANAPRESSUERPLATE = registerBlock(ModBlock.BANANAPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item BANANAFENCE = registerBlock(ModBlock.BANANAFENCE,BlockItem::new,defaultProperties());
    public static final Item BANANAFENCEGATE = registerBlock(ModBlock.BANANAFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item BANANADOOR = registerBlock(ModBlock.BANANADOOR,BlockItem::new,defaultProperties());
    public static final Item BANANATRAPDOOR = registerBlock(ModBlock.BANANATRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item PEACHLOG = registerBlock(ModBlock.PEACHLOG,BlockItem::new,defaultProperties());
    public static final Item PEACHWOOD = registerBlock(ModBlock.PEACHWOOD,BlockItem::new,defaultProperties());
    public static final Item PEACHLEAVES = registerBlock(ModBlock.PEACHLEAVES,BlockItem::new,defaultProperties());
    public static final Item PEACHSAPLING = registerBlock(ModTrees.PEACHSAPLING,BlockItem::new,defaultProperties());
    public static final Item PEACHPLANKS = registerBlock(ModBlock.PEACHPLANKS,BlockItem::new,defaultProperties());
    public static final Item PEACHSTAIRS = registerBlock(ModBlock.PEACHSTAIRS,BlockItem::new,defaultProperties());
    public static final Item PEACHSLAB = registerBlock(ModBlock.PEACHSLAB,BlockItem::new,defaultProperties());
    public static final Item PEACHBUTTON = registerBlock(ModBlock.PEACHBUTTON,BlockItem::new,defaultProperties());
    public static final Item PEACHPRESSUERPLATE = registerBlock(ModBlock.PEACHPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item PEACHFENCE = registerBlock(ModBlock.PEACHFENCE,BlockItem::new,defaultProperties());
    public static final Item PEACHFENCEGATE = registerBlock(ModBlock.PEACHFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item PEACHDOOR = registerBlock(ModBlock.PEACHDOOR,BlockItem::new,defaultProperties());
    public static final Item PEACHTRAPDOOR = registerBlock(ModBlock.PEACHTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item COCONUTLOG = registerBlock(ModBlock.COCONUTLOG,BlockItem::new,defaultProperties());
    public static final Item COCONUTWOOD = registerBlock(ModBlock.COCONUTWOOD,BlockItem::new,defaultProperties());
    public static final Item COCONUTLEAVES = registerBlock(ModBlock.COCONUTLEAVES,BlockItem::new,defaultProperties());
    public static final Item COCONUTSAPLING = registerBlock(ModTrees.COCONUTSAPLING,BlockItem::new,defaultProperties());
    public static final Item COCONUTPLANKS = registerBlock(ModBlock.COCONUTPLANKS,BlockItem::new,defaultProperties());
    public static final Item COCONUTSTAIRS = registerBlock(ModBlock.COCONUTSTAIRS,BlockItem::new,defaultProperties());
    public static final Item COCONUTSLAB = registerBlock(ModBlock.COCONUTSLAB,BlockItem::new,defaultProperties());
    public static final Item COCONUTBUTTON = registerBlock(ModBlock.COCONUTBUTTON,BlockItem::new,defaultProperties());
    public static final Item COCONUTPRESSUERPLATE = registerBlock(ModBlock.COCONUTPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item COCONUTFENCE = registerBlock(ModBlock.COCONUTFENCE,BlockItem::new,defaultProperties());
    public static final Item COCONUTFENCEGATE = registerBlock(ModBlock.COCONUTFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item COCONUTDOOR = registerBlock(ModBlock.COCONUTDOOR,BlockItem::new,defaultProperties());
    public static final Item COCONUTTRAPDOOR = registerBlock(ModBlock.COCONUTTRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item CARAMBOLALOG = registerBlock(ModBlock.CARAMBOLALOG,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAWOOD = registerBlock(ModBlock.CARAMBOLAWOOD,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLALEAVES = registerBlock(ModBlock.CARAMBOLALEAVES,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASAPLING = registerBlock(ModTrees.CARAMBOLASAPLING,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAPLANKS = registerBlock(ModBlock.CARAMBOLAPLANKS,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASTAIRS = registerBlock(ModBlock.CARAMBOLASTAIRS,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLASLAB = registerBlock(ModBlock.CARAMBOLASLAB,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLABUTTON = registerBlock(ModBlock.CARAMBOLABUTTON,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAPRESSUERPLATE = registerBlock(ModBlock.CARAMBOLAPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAFENCE = registerBlock(ModBlock.CARAMBOLAFENCE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLAFENCEGATE = registerBlock(ModBlock.CARAMBOLAFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLADOOR = registerBlock(ModBlock.CARAMBOLADOOR,BlockItem::new,defaultProperties());
    public static final Item CARAMBOLATRAPDOOR = registerBlock(ModBlock.CARAMBOLATRAPDOOR,BlockItem::new,defaultProperties());


    public static final Item TOONLOG = registerBlock(ModBlock.TOONLOG,BlockItem::new,defaultProperties());
    public static final Item TOONWOOD = registerBlock(ModBlock.TOONWOOD,BlockItem::new,defaultProperties());
    public static final Item TOONLEAVES = registerBlock(ModBlock.TOONLEAVES,BlockItem::new,defaultProperties());
    public static final Item TOONASAPLING = registerBlock(ModTrees.TOONSAPLING,BlockItem::new,defaultProperties());
    public static final Item TOONPLANKS = registerBlock(ModBlock.TOONPLANKS,BlockItem::new,defaultProperties());
    public static final Item TOONSTAIRS = registerBlock(ModBlock.TOONSTAIRS,BlockItem::new,defaultProperties());
    public static final Item TOONSLAB = registerBlock(ModBlock.TOONSLAB,BlockItem::new,defaultProperties());
    public static final Item TOONBUTTON = registerBlock(ModBlock.TOONBUTTON,BlockItem::new,defaultProperties());
    public static final Item TOONPRESSUERPLATE = registerBlock(ModBlock.TOONPRESSUERPLATE,BlockItem::new,defaultProperties());
    public static final Item TOONFENCE = registerBlock(ModBlock.TOONFENCE,BlockItem::new,defaultProperties());
    public static final Item TOONFENCEGATE = registerBlock(ModBlock.TOONFENCEGATE,BlockItem::new,defaultProperties());
    public static final Item TOONDOOR = registerBlock(ModBlock.TOONDOOR,BlockItem::new,defaultProperties());
    public static final Item TOONTRAPDOOR = registerBlock(ModBlock.TOONTRAPDOOR,BlockItem::new,defaultProperties());






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

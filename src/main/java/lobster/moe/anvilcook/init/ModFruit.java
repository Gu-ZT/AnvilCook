package lobster.moe.anvilcook.init;

import lobster.moe.anvilcook.AnvilCook;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModFruit {
    private static final Map<String, Item> ITEM_MAP = new HashMap<>();

    public final static Item PEAR = registerItem("pear", Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.PEAR));
    public final static Item LEMON = registerItem("lemon",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.LEMON));
    public final static Item GRAPE = registerItem("grape",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.GRAPE));
    public final static Item BANANA = registerItem("banana",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.BANANA));
    public final static Item WALNUT = registerItem("walnut",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.WALNUT));
    public final static Item CHERRY = registerItem("cherry",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.CHERRY));
    public final static Item PEACH = registerItem("peach",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.PEACH));
    public final static Item COCONUT = registerItem("coconut",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.COCONUT));
    public final static Item CARAMBOLA = registerItem("carambola",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.CARAMBOLA));
    public final static Item STRAWBERRY = registerItem("strawberry",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.STRAWBERRY));
    public final static Item BLUEBERRY = registerItem("blueberry",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.BLUEBERRY));
    public final static Item TOON = registerItem("toon",Item::new,defaultProperties().food(lobster.moe.anvilcook.item.ModFruit.TOON));








    private static Item registerItem(String id, @NotNull Function<Item.Properties, Item> itemCreator, Item.Properties properties) {
        Item item = itemCreator.apply(properties);
        ITEM_MAP.put(id, item);
        return item;
    }
    private static @NotNull Item.Properties defaultProperties() {
        return new Item.Properties();
    }

    public static void register() {
        for (Map.Entry<String, Item> entry : ModFruit.ITEM_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.ITEM, AnvilCook.of(entry.getKey()), entry.getValue());
        }
    }
}

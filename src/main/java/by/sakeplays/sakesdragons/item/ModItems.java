package by.sakeplays.sakesdragons.item;

import by.sakeplays.sakesdragons.SakesDragons;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SakesDragons.MODID);


    public static final RegistryObject<Item> SCROLL_OF_DRAGONS = ITEMS.register("scroll_of_dragons",
            () -> new ScrollOfDragonsItem(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

package com.ar4t1c.mcmod1.item;

import com.ar4t1c.mcmod1.AFM;
import com.ar4t1c.mcmod1.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> COMPOUND =
            Registration.ITEMS.register("compound",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));

    public static final RegistryObject<Item> RESIN =
            Registration.ITEMS.register("resin",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));

    public static final RegistryObject<Item> GRAPHITE =
            Registration.ITEMS.register("graphite",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));

    public static final RegistryObject<Item> GRAPHENE =
            Registration.ITEMS.register("graphene",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));

    public static final RegistryObject<Item> MARS_CORE_FRAGMENT =
            Registration.ITEMS.register("mars_core_fragment",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));

    public static final RegistryObject<Item> MOON_CORE_FRAGMENT =
            Registration.ITEMS.register("moon_core_fragment",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));

    public static final RegistryObject<Item> SOIL_BAG =
            Registration.ITEMS.register("soil_bag",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));

    public static final RegistryObject<Item> ASTROMINIUM =
            Registration.ITEMS.register("astrominium",
                    () -> new Item(new Item.Properties().group(AFM.AFM)));


    public static void register() {

    }



}

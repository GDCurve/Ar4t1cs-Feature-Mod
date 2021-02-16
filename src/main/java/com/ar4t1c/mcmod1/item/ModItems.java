package com.ar4t1c.mcmod1.item;

import com.ar4t1c.mcmod1.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> COMPUND =
            Registration.ITEMS.register("compound",
                    () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static void register() {

    }



}

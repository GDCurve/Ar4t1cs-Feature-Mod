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

    public static void register() {

    }



}

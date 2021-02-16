package com.ar4t1c.mcmod1.block;

import com.ar4t1c.mcmod1.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> COMPOUND_BLOCK = register("compound_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(3f, 10f).sound(SoundType.ANCIENT_DEBRIS)));

    public static final RegistryObject<Block> COMPRESSED_COMPOUND_BLOCK = register("compressed_compound_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(3f, 50f).sound(SoundType.ANCIENT_DEBRIS)));

    public static void register() { }

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;
    }
}

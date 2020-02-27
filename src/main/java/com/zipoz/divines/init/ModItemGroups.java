package com.zipoz.divines.init;

import com.zipoz.divines.ModEventSubscriber;
import com.zipoz.divines.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups extends ItemGroup {

    private final Supplier<ItemStack> iconSupplier;
    public static final ItemGroup DIVINES_GROUP = new ModItemGroups(Reference.MODID, ()-> new ItemStack(ModItems.RECONDITE_MYST));

    public ModItemGroups(final String name, final Supplier<ItemStack> iconSupplier)
    {

        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack createIcon() {
        return iconSupplier.get();
    }
}

package com.jlgm.mmdr.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.item.ItemStack;

public class BlockExampleDoubleSlab extends BlockExampleSlab{

	public BlockExampleDoubleSlab(Material materialIn) {
		super(materialIn);
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	@Override
	public boolean isDouble() {
		return true;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return VARIANT_PROPERTY;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		return null;
	}

}

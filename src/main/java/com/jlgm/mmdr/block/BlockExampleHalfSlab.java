package com.jlgm.mmdr.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;

public class BlockExampleHalfSlab extends BlockExampleSlab{
	
	public BlockExampleHalfSlab(Material materialIn) {
		super(materialIn);
		IBlockState blockState = this.blockState.getBaseState();
		blockState = blockState.withProperty(VARIANT_PROPERTY, false);
		if(!this.isDouble()){
			blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		
		this.setDefaultState(blockState);
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return this.getUnlocalizedName();
	}

	@Override
	public boolean isDouble() {
		return false;
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

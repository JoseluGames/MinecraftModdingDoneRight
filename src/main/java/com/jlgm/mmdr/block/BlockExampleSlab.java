package com.jlgm.mmdr.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class BlockExampleSlab extends BlockSlab{
	
	protected static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
	private static final int HALF_META_BIT = 8;
	
	public BlockExampleSlab(Material materialIn) {
		super(materialIn);
	}
	
	@Override
	public final IBlockState getStateFromMeta(final int meta){
		IBlockState blockState = this.getDefaultState();
		blockState = blockState.withProperty(VARIANT_PROPERTY, false);
		if(!this.isDouble()){
			EnumBlockHalf value = EnumBlockHalf.BOTTOM;
			if((meta & HALF_META_BIT) != 0){
				value = EnumBlockHalf.TOP;
			}
			
			blockState = blockState.withProperty(HALF, value);
		}
		return blockState;
	}
	
	@Override
	public final int getMetaFromState(final IBlockState state){
		if(this.isDouble()){
			return 0;
		}
		
		if((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP){
			return HALF_META_BIT;
		}else{
			return 0;
		}
	}

    /**
     * Creates the block state object.
     * @return the block state with properties defined.
     */
    @Override
    protected final BlockStateContainer createBlockState() {
        if (this.isDouble()) {
            return new BlockStateContainer(this, new IProperty[] {VARIANT_PROPERTY});
        } else {
            return new BlockStateContainer(
                this,
                new IProperty[] {VARIANT_PROPERTY, HALF});
        }
    }
}

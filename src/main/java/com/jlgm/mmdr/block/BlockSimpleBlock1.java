package com.jlgm.mmdr.block;

import com.jlgm.mmdr.creativetab.MMDRCreativeTab;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockSimpleBlock1 extends Block{

	public BlockSimpleBlock1(Material materialIn, String blockName) {
		super(materialIn);
		this.setRegistryName(blockName);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(MMDRCreativeTab.tabMMDR);
		this.setHardness(0.7F);
	}

}
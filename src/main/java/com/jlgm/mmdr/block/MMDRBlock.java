package com.jlgm.mmdr.block;

import com.jlgm.mmdr.lib.MMDRConstants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MMDRBlock {
	
	public static Block simpleBlock1;
	public static ItemBlock simpleBlock1ItemBlock;
	
	public static void mainReigstry(Configuration configuration){
		initialiseBlock();
	}
	
	public static void initialiseBlock(){
		simpleBlock1 = new BlockSimpleBlock1(Material.ROCK, "simpleBlock1");
		simpleBlock1ItemBlock = new ItemBlock(simpleBlock1);
	}
	
	public static void registerBlockRenderers() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(simpleBlock1ItemBlock, 0, new ModelResourceLocation(MMDRConstants.MODID + ":" + "simpleBlock1", "inventory"));
	}
	
	public static void registerBlock(){
		GameRegistry.register(simpleBlock1);
		GameRegistry.register(simpleBlock1ItemBlock.setRegistryName(simpleBlock1.getRegistryName()));
	}
}

package com.jlgm.mmdr.block;

import com.jlgm.mmdr.lib.MMDRConstants;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MMDRBlock {
	
	public static Block simpleBlock1;
	public static ItemBlock simpleBlock1ItemBlock;
	public static Block wall1;
	public static ItemBlock wall1ItemBlock;
	
	public static void mainReigstry(Configuration configuration){
		initialiseBlock();
	}
	
	public static void initialiseBlock(){
		simpleBlock1 = new BlockSimpleBlock1(Material.ROCK, "simpleBlock1");
		simpleBlock1ItemBlock = new ItemBlock(simpleBlock1);

		wall1 = new BlockWall1(Blocks.DIRT, 0.5F, 0.5F, MapColor.BLUE, "wall1");
		wall1ItemBlock = new ItemBlock(wall1);
	}
	
	public static void registerBlockRenderers() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		renderItem.getItemModelMesher().register(simpleBlock1ItemBlock, 0, new ModelResourceLocation(MMDRConstants.MODID + ":" + "simpleBlock1", "inventory"));
	}
	
	public static void registerBlock(){
		GameRegistry.register(simpleBlock1);
		GameRegistry.register(simpleBlock1ItemBlock.setRegistryName(simpleBlock1.getRegistryName()));

		renderItem.getItemModelMesher().register(wall1ItemBlock, 0, new ModelResourceLocation(MMDRConstants.MODID + ":" + "wall1", "inventory"));
		GameRegistry.register(wall1);
		GameRegistry.register(wall1ItemBlock.setRegistryName(wall1.getRegistryName()));
	}
}

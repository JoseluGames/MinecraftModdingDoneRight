/**
 * Wiki pages for this class:
 *  - Achievements: https://github.com/JoseluGames/MinecraftModdingDoneRight/wiki/Basic-block
 */

package com.jlgm.mmdr.block;

import com.jlgm.mmdr.creativetab.MMDRCreativeTab;
import com.jlgm.mmdr.lib.MMDRConstants;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MMDRBlock {
	
	public static Block example_block_1;
	public static ItemBlock example_block_1_ItemBlock;
	
	public static Block example_static_lamp_1;
	public static ItemBlock example_static_lamp_1_ItemBlock;

	public static Block example_wall_1;
	public static ItemBlock example_wall_1_ItemBlock;
	
	public static void mainRegistry(Configuration configuration){
		initialiseBlock();
	}
	
	public static void initialiseBlock(){
		example_block_1 = new Block(Material.ROCK).setUnlocalizedName("example_block_1").setHardness(0.7F).setResistance(0.5F).setCreativeTab(MMDRCreativeTab.example_creative_tab_1);
		example_block_1_ItemBlock = new ItemBlock(example_block_1);
		
		example_static_lamp_1 = new Block(Material.GLASS).setUnlocalizedName("example_static_lamp_1").setHardness(0.3F).setResistance(0.2F).setLightLevel(1F).setCreativeTab(MMDRCreativeTab.example_creative_tab_1);
		example_static_lamp_1_ItemBlock = new ItemBlock(example_static_lamp_1);

		example_wall_1 = new BlockExampleWall(MMDRBlock.example_block_1).setUnlocalizedName("example_wall_1").setCreativeTab(MMDRCreativeTab.example_creative_tab_1);
		example_wall_1_ItemBlock = new ItemBlock(example_wall_1);
	}
	
	public static void registerBlock(){
		GameRegistry.register(example_block_1.setRegistryName("example_block_1"));
		GameRegistry.register(example_block_1_ItemBlock.setRegistryName(example_block_1.getRegistryName()));

		GameRegistry.register(example_static_lamp_1.setRegistryName("example_static_lamp_1"));
		GameRegistry.register(example_static_lamp_1_ItemBlock.setRegistryName(example_static_lamp_1.getRegistryName()));
		
		GameRegistry.register(example_wall_1.setRegistryName("example_wall_1"));
		GameRegistry.register(example_wall_1_ItemBlock.setRegistryName(example_wall_1.getRegistryName()));
	}
	
	public static void renderBlock(){
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		
		renderItem.getItemModelMesher().register(example_block_1_ItemBlock, 0, new ModelResourceLocation(MMDRConstants.MODID + ":" + "example_block_1", "inventory"));
		
		renderItem.getItemModelMesher().register(example_static_lamp_1_ItemBlock, 0, new ModelResourceLocation(MMDRConstants.MODID + ":" + "example_static_lamp_1", "inventory"));
		
		renderItem.getItemModelMesher().register(example_wall_1_ItemBlock, 0, new ModelResourceLocation(MMDRConstants.MODID + ":" + "example_wall_1", "inventory"));
	}
}

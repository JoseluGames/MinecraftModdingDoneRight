package com.jlgm.mmdr.main;

import com.jlgm.mmdr.achievement.MMDRAchievement;
import com.jlgm.mmdr.block.MMDRBlock;
import com.jlgm.mmdr.creativetab.MMDRCreativeTab;
import com.jlgm.mmdr.event.MMDREventListener;
import com.jlgm.mmdr.item.MMDRItem;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preInitEvent){
		Configuration config = new Configuration(preInitEvent.getSuggestedConfigurationFile());
		config.load();
		
		config.save();
		MinecraftForge.EVENT_BUS.register(new MMDREventListener());
		
		MMDRCreativeTab.mainRegistry(config);
		MMDRBlock.mainRegistry(config);
		MMDRItem.mainRegistry(config);
	}
	
	public void init(FMLInitializationEvent initEvent){
		
		MMDRBlock.registerBlock();
		MMDRItem.registerItem();
		MMDRAchievement.registerAchievement();
	}
	
	public void postInit(FMLPostInitializationEvent postInitEvent){
		
	}
}
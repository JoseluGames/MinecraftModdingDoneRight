package com.jlgm.mmdr.main;

import com.jlgm.mmdr.block.MMDRBlock;
import com.jlgm.mmdr.creativetab.MMDRCreativeTab;
import com.jlgm.mmdr.item.MMDRItem;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preInitEvent){
		Configuration config = new Configuration(preInitEvent.getSuggestedConfigurationFile());
		config.load();
		
		config.save();
		
		MMDRCreativeTab.mainRegistry(config);
		MMDRBlock.mainReigstry(config);
		MMDRItem.mainRegistry(config);
	}
	
	public void init(FMLInitializationEvent initEvent){
		MMDRBlock.registerBlock();
	}
	
	public void postInit(FMLPostInitializationEvent postInitEvent){
		
	}
}
package com.jlgm.mmdr.main;

import com.jlgm.mmdr.block.MMDRBlock;
import com.jlgm.mmdr.item.MMDRItem;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void preInit(FMLPreInitializationEvent preInitEvent){
		super.preInit(preInitEvent);
	}
	
	@Override
	public void init(FMLInitializationEvent initEvent){
		super.init(initEvent);
		MMDRBlock.registerBlockRenderers();
		MMDRItem.registerItem();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent postInitEvent){
		super.postInit(postInitEvent);
	}
}
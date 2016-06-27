package com.jlgm.mmdr.main;

import com.jlgm.mmdr.lib.Constants;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID,
	name = Constants.NAME,
	version = Constants.VERSION,
	acceptedMinecraftVersions = Constants.ACCEPTEDMINECRAFTVERSIONS)

public class MMDR {
	
	@SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.SERVER_PROXY)
	public static ServerProxy proxy;
	@Instance("MMDR")
	public static MMDR instance;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent preEvent){
		
		
		proxy.PreInit();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event){
		
		
		proxy.Init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent postEvent){
		
		
		proxy.PostInit();
	}
}
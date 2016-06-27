package com.jlgm.mmdr.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

public class MMDRCreativeTab {
	
	public static CreativeTabs tabMMDR;
	
	public static void mainRegistry(Configuration par1Configuration){
		initialiseCreativeTab();
	}
	
	public static void initialiseCreativeTab(){
		tabMMDR = new CreativeTabMMDR(CreativeTabs.getNextID(), "MMDR");
	}
}

package com.jlgm.mmdr.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

public class MMDRCreativeTab {
	
	//Create the variable for the tab
	public static CreativeTabs tabMMDR;
	
	public static void mainRegistry(Configuration par1Configuration){
		initialiseCreativeTab();
	}
	
	//Set a value to the variable (In this case the value is a creative tab).
	//The second parameter is the unlocalized name. This is used in the .lang files to translate the name.
	public static void initialiseCreativeTab(){
		tabMMDR = new CreativeTabMMDR(CreativeTabs.getNextID(), "MMDR");
	}
}

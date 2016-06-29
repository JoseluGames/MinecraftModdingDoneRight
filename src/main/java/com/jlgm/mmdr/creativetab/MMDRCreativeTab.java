package com.jlgm.mmdr.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

public class MMDRCreativeTab {
	
	//Create the variable for the tab
	public static CreativeTabs example_creative_tab_1;
	
	public static void mainRegistry(Configuration par1Configuration){
		initialiseCreativeTab();
	}
	
	//Set a value to the variable (In this case the value is a creative tab).
	//The second parameter is the unlocalized name. This is used in the .lang files to localize the name.
	public static void initialiseCreativeTab(){
		example_creative_tab_1 = new CreativeTab_Example_1(CreativeTabs.getNextID(), "example_creative_tab_1");
	}
}

package com.jlgm.mmdr.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabMMDR extends CreativeTabs {

	public CreativeTabMMDR(int index, String label) {
		super(index, label);
	}
	
	//Sets the item to show in the tab.
	@Override
	public Item getTabIconItem() {
		return Items.DIAMOND_PICKAXE;
	}

}

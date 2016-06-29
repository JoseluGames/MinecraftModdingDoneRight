/**
 * Wiki pages for this class:
 *  - Creative Tab: https://github.com/JoseluGames/MinecraftModdingDoneRight/wiki/Creative-Tab
 */

package com.jlgm.mmdr.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab_Example_1 extends CreativeTabs {

	public CreativeTab_Example_1(int index, String label) {
		super(index, label);
	}
	
	//Sets the item to show in the tab.
	@Override
	public Item getTabIconItem() {
		return Items.DIAMOND_PICKAXE;
	}

}

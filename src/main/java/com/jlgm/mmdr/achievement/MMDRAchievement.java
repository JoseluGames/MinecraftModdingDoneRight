package com.jlgm.mmdr.achievement;

import com.jlgm.mmdr.block.MMDRBlock;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.config.Configuration;

public class MMDRAchievement {
	
	public static Achievement example_achievement_1;
	public static Achievement example_achievement_2;
	
	public static void registerAchievement(){
		System.out.println("Test");
		example_achievement_1 = new Achievement("achievement.example_achievement_1", "example_achievement_1", -2, 3, MMDRBlock.example_block_1, AchievementList.OPEN_INVENTORY).registerStat();
		example_achievement_2 = new Achievement("achievement.example_achievement_2", "example_achievement_2", -1, 4, MMDRBlock.example_static_lamp_1, MMDRAchievement.example_achievement_1).registerStat();
	}
}
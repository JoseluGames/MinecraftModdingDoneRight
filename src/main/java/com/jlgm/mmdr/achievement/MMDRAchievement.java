package com.jlgm.mmdr.achievement;

import com.jlgm.mmdr.block.MMDRBlock;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

public class MMDRAchievement {
	
	public static Achievement example_achievement_1;
	public static Achievement example_achievement_2;
	public static Achievement example_achievement_3;
	
	public static Achievement example_achievement_4;
	public static Achievement example_achievement_5;
	
	public static AchievementPage example_achievement_page_1;
	
	public static void registerAchievement(){
		example_achievement_1 = new Achievement("achievement.example_achievement_1", "example_achievement_1", -2, 3, MMDRBlock.example_block_1, AchievementList.OPEN_INVENTORY).registerStat();
		example_achievement_2 = new Achievement("achievement.example_achievement_2", "example_achievement_2", -2, 5, MMDRBlock.example_static_lamp_1, MMDRAchievement.example_achievement_1).registerStat();
		example_achievement_3 = new Achievement("achievement.example_achievement_3", "example_achievement_3", 0, 7, Items.NETHER_STAR, MMDRAchievement.example_achievement_2).setSpecial().registerStat();
		
		example_achievement_4 = new Achievement("achievement.example_achievement_4", "example_achievement_4", 0, 0, Blocks.TNT, null).registerStat();
		example_achievement_5 = new Achievement("achievement.example_achievement_5", "example_achievement_5", 2, 2, Items.SKULL, MMDRAchievement.example_achievement_4).setSpecial().registerStat();
		
		example_achievement_page_1 = new AchievementPage("Example Achievement Page 1", example_achievement_4, example_achievement_5);
		AchievementPage.registerAchievementPage(example_achievement_page_1);
	}
}
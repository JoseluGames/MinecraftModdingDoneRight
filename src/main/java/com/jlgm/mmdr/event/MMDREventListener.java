package com.jlgm.mmdr.event;

import com.jlgm.mmdr.achievement.MMDRAchievement;
import com.jlgm.mmdr.block.MMDRBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MMDREventListener {
	
	@SubscribeEvent
	public void onEventPlaceExampleBlock(PlaceEvent event){
		EntityPlayer player = event.getPlayer();
		if(event.getPlacedBlock().getBlock().equals(MMDRBlock.example_block_1)){
			player.addStat(MMDRAchievement.example_achievement_1);
		}else if(event.getPlacedBlock().getBlock().equals(MMDRBlock.example_block_1)){
			player.addStat(MMDRAchievement.example_achievement_2);
		}
	}
	
}
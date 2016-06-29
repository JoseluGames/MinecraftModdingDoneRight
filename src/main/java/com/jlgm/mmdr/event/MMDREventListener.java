package com.jlgm.mmdr.event;

import com.jlgm.mmdr.achievement.MMDRAchievement;
import com.jlgm.mmdr.block.MMDRBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MMDREventListener {
	
	@SubscribeEvent
	public void onEventPlaceExampleBlock(PlaceEvent event){
		if(event.getPlacedBlock().getBlock().equals(MMDRBlock.example_block_1)){
			event.getPlayer().addStat(MMDRAchievement.example_achievement_1);
		}
		
		if(event.getPlacedBlock().getBlock().equals(MMDRBlock.example_static_lamp_1)){
			event.getPlayer().addStat(MMDRAchievement.example_achievement_2);
		}
	}
	
	@SubscribeEvent
	public void onEventDropItem(ItemTossEvent event){
		if(event.getEntityItem().getEntityItem().getItem().equals(Item.getItemFromBlock(MMDRBlock.example_block_1))){
			event.getPlayer().addStat(MMDRAchievement.example_achievement_3);
		}
	}
}
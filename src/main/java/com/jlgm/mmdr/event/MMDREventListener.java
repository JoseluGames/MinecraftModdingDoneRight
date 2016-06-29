/**
 * Wiki pages for this class:
 *  - Achievements: https://github.com/JoseluGames/MinecraftModdingDoneRight/wiki/Achievements
 */

package com.jlgm.mmdr.event;

import com.jlgm.mmdr.achievement.MMDRAchievement;
import com.jlgm.mmdr.block.MMDRBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.event.world.BlockEvent.PlaceEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MMDREventListener {
	
	public static EntityPlayer playerDetonator;
	
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
	
	@SubscribeEvent
	public void onEventRightClickBlock(RightClickBlock event){
		if(event.getItemStack() != null && event.getWorld().getBlockState(event.getPos()).getBlock() != null){
			if(event.getWorld().getBlockState(event.getPos()).getBlock().equals(Blocks.TNT)
					&& event.getItemStack().getItem().equals(Items.FLINT_AND_STEEL)
					|| event.getItemStack().getItem().equals(Items.FIRE_CHARGE)){
				playerDetonator = event.getEntityPlayer();
				event.getEntityPlayer().addStat(MMDRAchievement.example_achievement_4);
			}
		}
	}
	
	@SubscribeEvent
	public void onEventPlayerDeath(LivingDeathEvent event){
		if(event.getEntityLiving() != null && event.getEntityLiving() instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) event.getEntityLiving();
			if(player.isEntityEqual(playerDetonator)){
				player.addStat(MMDRAchievement.example_achievement_5);
			}
		}
	}
}
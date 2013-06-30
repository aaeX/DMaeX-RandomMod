package com.dmaex.mod.random.item;

import java.util.Random;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBallFlight extends Item{
	public ItemBallFlight(int id){
		super(id);
		
		setMaxStackSize(16);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("itemBallFlight");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		ItemStack originStack = stack;
		
		// for particle spreading
		Random rand = new Random();
		
		// play sound effect
		world.playSoundAtEntity(player, "random.breath", 1.0F, 1.25F + (rand.nextFloat() / 2));
		
		// spawn 60 smoke particles with player pos. 
		// .nextFloat() gives 0.0-1.0, /2 = 0.0-0.5
		// -0.25 to make it from -.25 - .25
		for(int i = 0; i < 60; i++){
			world.spawnParticle("smoke", 
					player.posX + (rand.nextFloat() / 2 - (0.25F)), 
					player.posY + (rand.nextFloat() / 2 - (0.25F)) - 1, // -1 to make sure that the 
					player.posZ + (rand.nextFloat() / 2 - (0.25F)),     // particles start @ feet of
					0.0D,											    // the player
					-0.2D, // make particles go downwards
					0.0D
					);
		}
		
		// shoots the player up
		player.addVelocity(0.0, 1.0, 0.0);
		
		// make the stack smaller
		stack.stackSize--;
		
		return stack;
		
	}
	
	@Override
	public boolean hasEffect(ItemStack s){
		return true;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack s){
		return EnumRarity.rare;
	}
	
	@Override
	public void registerIcons(IconRegister ir){
		itemIcon = ir.registerIcon("ModRandom:itemBallFlight");
	}
}
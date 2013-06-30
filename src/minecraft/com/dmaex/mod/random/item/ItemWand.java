package com.dmaex.mod.random.item;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public abstract class ItemWand extends Item{
	String texture;
	
	protected ItemWand(int id, String nname, String ttexture){
		super(id);
		
		texture = ttexture;
		
		setCreativeTab(CreativeTabs.tabTools);
		setUnlocalizedName(nname);
		
		setMaxStackSize(1);
		setMaxDamage(63);
		setNoRepair();
	}
	
	@Override
	public final ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		player.playSound("random.bow", 1.0F, 1.0F); // play sound; you can change this, digi!
		onWandTrigger(stack, world, player); // do effect
		
		stack.damageItem(1, player); // damage wand
		
		return stack;
	}
	
	// i didn't want to have to super(stack world player) for every wand, so this abstract method
	// is where everything will happen :)
	public abstract void onWandTrigger(ItemStack stack, World world, EntityPlayer player);
	
	@Override
	@SideOnly(Side.CLIENT)
	public final void registerIcons(IconRegister ir){
		itemIcon = ir.registerIcon("ModRandom:" + texture); // customizable textures, whee!
	}
}
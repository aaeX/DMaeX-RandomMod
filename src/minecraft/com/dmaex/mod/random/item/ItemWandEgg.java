package com.dmaex.mod.random.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWandEgg extends ItemWand{
	public ItemWandEgg(int id){
		super(id, "itemWandEgg"/*item name*/, "itemWandEgg"/*texture name*/);
		// digi, PLEASE make texture file names the SAME as unlocalized
		// names! i didn't make items look for textures using their name
		// for flexibility, so just bear that in mind D:
	}

	@Override
	public void onWandTrigger(ItemStack stack, World world, EntityPlayer player){
		System.out.println("Egg wand triggered!"); // add effect later

	        if (!world.isRemote)
	        {
	            world.spawnEntityInWorld(new EntityEgg(world, player));
	        }


		// this should shoot eggs, maybe you can take care of that, digi?
	}
}
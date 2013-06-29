package com.dmaex.mod.random;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = AexMagic.modid, name = "Aex's Random Magic", version = "a1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AexMagic{
	// NOTE: DO NOT MODIFY THIS! ================== //
	public static final String modid = "aex_magic";
	// ============================================ //
	
	// search::item
	
	@Instance(modid)
	public static AexMagic instance;
	
	
	// note: client proxy loads images, gui handlers...
	//     : server proxy does processing
	@SidedProxy(clientSide = "aex.mods.magic.client.ClientProxy",
			serverSide = "aex.mods.magic.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent ev){
		// read config files.
	}
	
	@Init
	public void init(FMLInitializationEvent ev){
		// registries, crafting recipes, common things and all.
		
		// search::recipe
		
		// search::item
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent ev){
		// code to work with other mods.
	}
}
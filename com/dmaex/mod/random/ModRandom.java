package com.dmaex.mod.random;

import com.dmaex.mod.random.item.ItemBallFlight;

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
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModRandom.modid, name = "Random", version = "a1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class ModRandom{
	// note: i've used search:: so that if you're looking for
	// something you can just CTRL F 'search::' then the thin
	// g you're looking for. you welcome :)
	//     : all search:: things are SINGULAR (no s at the en
	//       d of search::anything, for instance)
	
	// search::item
	public static Item itemAwesome;
	
	// search::block
	
	// NOTE: DO NOT MODIFY THIS! ================== //
	public static final String modid = "dmaex_random";
	// ============================================ //
	
	// mod instance. not sure what this is for, but... o.O
	@Instance(modid)
	public static ModRandom instance;
	
	
	// note: client proxy loads images, gui handlers...
	//     : common proxy does processing
	@SidedProxy(clientSide = "com.dmaex.mod.random.client.ClientProxy",
			serverSide = "com.dmaex.mod.random.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent ev){
		// read config files.
	}
	
	@Init
	public void init(FMLInitializationEvent ev){
		// registries, crafting recipes, common things and all.
		
		// search::item
		itemAwesome = new ItemBallFlight(5000);
		
		// search::block 
		
		// search:register
		LanguageRegistry.addName(itemAwesome, "Awesome Item");
		
		// search::recipe
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent ev){
		// code to work with other mods.
	}
}
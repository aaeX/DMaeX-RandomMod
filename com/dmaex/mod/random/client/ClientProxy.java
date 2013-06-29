package com.dmaex.mod.random.client;

import com.dmaex.mod.random.CommonProxy;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderers(){
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
	}
}

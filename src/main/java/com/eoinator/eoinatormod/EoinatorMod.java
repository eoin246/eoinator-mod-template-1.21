package com.eoinator.eoinatormod;

import com.eoinator.eoinatormod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EoinatorMod implements ModInitializer {
	public static final String MOD_ID = "eoinatormod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
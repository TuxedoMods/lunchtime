package tuxedo.lunchtime;

import net.fabricmc.api.ModInitializer;
import tuxedo.lunchtime.registry.FoodItems;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lunchtime implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("lunchtime");

	public static final String MOD_ID = "lunchtime";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// LOGGER.info("Hello Fabric world!");

		FoodItems.registerItems();
	}
}

package tuxedo.lunchtime.registry;

import tuxedo.lunchtime.registry.items.cheese;
import tuxedo.lunchtime.registry.items.fried_egg;
import tuxedo.lunchtime.registry.items.jam;
import tuxedo.lunchtime.registry.items.sandwiches;

public class FoodItems {
	public static void registerItems() {
		cheese.registerItems();
		fried_egg.registerItems();
		jam.registerItems();
		sandwiches.registerItems();
	}
}
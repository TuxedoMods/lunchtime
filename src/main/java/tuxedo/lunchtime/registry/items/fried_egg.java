package tuxedo.lunchtime.registry.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tuxedo.lunchtime.Lunchtime;

public class fried_egg {
	public static final Item FOOD_ITEM = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(4)
					.saturationModifier(0.6f)
					.build())
			.maxCount(16));

	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "fried_egg"), FOOD_ITEM);
	}
}
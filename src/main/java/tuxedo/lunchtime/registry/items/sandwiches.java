package tuxedo.lunchtime.registry.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tuxedo.lunchtime.Lunchtime;

public class sandwiches {
	public static final Item STEAK_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(10)
					.saturationModifier(1f)
					.build())
			.maxCount(16));

	public static final Item PORKCHOP_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(10)
					.saturationModifier(1f)
					.build())
			.maxCount(16));

	public static final Item JAM_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(10)
					.saturationModifier(0.8f)
					.build())
			.maxCount(16));

	public static final Item EGG_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(9)
					.saturationModifier(1.1f)
					.build())
			.maxCount(16));

	public static final Item CHEESE_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(10)
					.saturationModifier(1f)
					.build())
			.maxCount(16));

	public static final Item CHICKEN_SANDWICH = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(10)
					.saturationModifier(1f)
					.build())
			.maxCount(16));

	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "steak_sandwich"), STEAK_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "porkchop_sandwich"), PORKCHOP_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "jam_sandwich"), JAM_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "egg_sandwich"), EGG_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "cheese_sandwich"), CHEESE_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "chicken_sandwich"), CHICKEN_SANDWICH);
	}
}
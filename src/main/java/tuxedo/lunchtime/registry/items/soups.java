package tuxedo.lunchtime.registry.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tuxedo.lunchtime.Lunchtime;

public class soups {
	public static final Item MEAT_STEW = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(16)
					.saturationModifier(1.5f)
					.build())
			.recipeRemainder(Items.BOWL));

	public static final Item POTATO_SOUP = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(8)
					.saturationModifier(0.8f)
					.build())
			.recipeRemainder(Items.BOWL));

	public static final Item PUMPKIN_SOUP = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(6)
					.saturationModifier(0.8f)
					.build())
			.recipeRemainder(Items.BOWL));

	public static final Item CARROT_SOUP = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(8)
					.saturationModifier(0.8f)
					.build())
			.recipeRemainder(Items.BOWL));

	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "meat_stew"), MEAT_STEW);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "potato_soup"), POTATO_SOUP);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "pumpkin_soup"), PUMPKIN_SOUP);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "carrot_soup"), CARROT_SOUP);
	}
}
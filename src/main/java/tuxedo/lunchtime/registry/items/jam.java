package tuxedo.lunchtime.registry.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tuxedo.lunchtime.Lunchtime;

public class jam {
	public static final Item SWEET_BERRY_JAM = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.saturationModifier(6f)
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20 * 5, 2), 1f)
					.build())
			.recipeRemainder(Items.GLASS_BOTTLE));

	public static final Item GLOW_BERRY_JAM = new Item(new Item.Settings().group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.saturationModifier(6f)
					.statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 20 * 5), 1f)
					.build())
			.recipeRemainder(Items.GLASS_BOTTLE));

	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "sweet_berry_jam"), SWEET_BERRY_JAM);
		Registry.register(Registry.ITEM, new Identifier(Lunchtime.MOD_ID, "glow_berry_jam"), GLOW_BERRY_JAM);
	}
}
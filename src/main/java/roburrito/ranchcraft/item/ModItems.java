package roburrito.ranchcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemBase hoof_pick;
	
	public static void init() {
		hoof_pick = register(new ItemBase("hoof_pick").setCreativeTab(CreativeTabs.TOOLS));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}
}
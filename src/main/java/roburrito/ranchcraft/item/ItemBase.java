package roburrito.ranchcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roburrito.ranchcraft.RanchCraft;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		System.out.println(this.getRegistryName());
	}

	public void registerItemModel() {
		RanchCraft.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}

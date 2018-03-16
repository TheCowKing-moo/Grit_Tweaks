package com.thecowking_moo.grittweaks.items;

import com.thecowking_moo.grittweaks.Main;
import com.thecowking_moo.grittweaks.init.ModItems;
import com.thecowking_moo.grittweaks.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
public ItemBase(String name)
{
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.MATERIALS);
	
	ModItems.ITEMS.add(this);
}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

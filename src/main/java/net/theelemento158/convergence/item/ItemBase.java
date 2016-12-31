package net.theelemento158.convergence.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.theelemento158.convergence.Convergence;

public class ItemBase extends Item implements ItemModelProvider{
    protected String name;

    public ItemBase(String name){
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Convergence.creativeTab);
    }

    @Override
    public void registerItemModel(Item item){
        Convergence.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}

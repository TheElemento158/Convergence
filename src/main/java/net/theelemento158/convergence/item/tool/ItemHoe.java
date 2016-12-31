package net.theelemento158.convergence.item.tool;

import net.minecraft.item.Item;
import net.theelemento158.convergence.Convergence;
import net.theelemento158.convergence.item.ItemModelProvider;

public class ItemHoe extends net.minecraft.item.ItemHoe implements ItemModelProvider {
    private String name;

    public ItemHoe(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    @Override
    public void registerItemModel(Item item) {
        Convergence.proxy.registerItemRenderer(this, 0, name);
    }
}

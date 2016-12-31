package net.theelemento158.convergence.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.theelemento158.convergence.Convergence;
import net.theelemento158.convergence.item.ItemModelProvider;

public class ItemShovel extends ItemSpade implements ItemModelProvider {
    private String name;

    public ItemShovel(ToolMaterial material, String name) {
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

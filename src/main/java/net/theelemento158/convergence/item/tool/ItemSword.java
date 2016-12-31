package net.theelemento158.convergence.item.tool;

import net.minecraft.item.Item;
import net.theelemento158.convergence.item.ItemModelProvider;
import net.theelemento158.convergence.Convergence;

public class ItemSword extends net.minecraft.item.ItemSword implements ItemModelProvider {
    private String name;

    public ItemSword(Item.ToolMaterial material, String name) {
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

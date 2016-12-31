package net.theelemento158.convergence.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;
import net.theelemento158.convergence.Convergence;

public class ItemCorn extends ItemFood implements ItemModelProvider, ItemOreDict {
    public ItemCorn() {
        super(3, 0.6f, false);
        setUnlocalizedName("corn");
        setRegistryName("corn");
        setCreativeTab(Convergence.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        Convergence.proxy.registerItemRenderer(this, 0, "corn");
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre("oreCorn", this);
    }
}

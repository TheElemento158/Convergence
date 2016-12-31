package net.theelemento158.convergence.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.theelemento158.convergence.Convergence;
import net.theelemento158.convergence.block.ModBlocks;

public class ConvergenceTab extends CreativeTabs {
    public ConvergenceTab(){
        super(Convergence.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public Item getTabIconItem(){
        return Item.getItemFromBlock(ModBlocks.oreVoid);
    }

    @Override
    public boolean hasSearchBar(){
        return true;
    }
}

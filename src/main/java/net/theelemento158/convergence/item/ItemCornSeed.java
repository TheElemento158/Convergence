package net.theelemento158.convergence.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.theelemento158.convergence.Convergence;
import net.theelemento158.convergence.block.ModBlocks;

public class ItemCornSeed extends ItemSeeds implements ItemModelProvider {
    public ItemCornSeed(){
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("cornSeed");
        setRegistryName("cornSeed");
        setCreativeTab(Convergence.creativeTab);
    }

    @Override
    public void registerItemModel(Item item){
        Convergence.proxy.registerItemRenderer(item, 0, "cornSeed");
    }
}

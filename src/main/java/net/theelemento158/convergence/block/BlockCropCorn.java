package net.theelemento158.convergence.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.theelemento158.convergence.Convergence;
import net.theelemento158.convergence.item.ModItems;

public class BlockCropCorn extends BlockCrops{
    public BlockCropCorn(){
        setUnlocalizedName("cropCorn");
        setRegistryName("cropCorn");
        setCreativeTab(Convergence.creativeTab);
    }

    @Override
    protected Item getSeed(){
        return ModItems.cornSeed;
    }

    @Override
    protected Item getCrop(){
        return ModItems.corn;
    }
}

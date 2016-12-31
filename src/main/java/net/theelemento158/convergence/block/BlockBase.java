package net.theelemento158.convergence.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.theelemento158.convergence.Convergence;
import net.theelemento158.convergence.item.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider{
    protected String name;

    public BlockBase(Material material, String name, float hardness, float resistance){
        super(material);

        this.name = name;

        if(hardness != 0) {
            setHardness(hardness);
        }else{
            setHardness(3f);
        }

        if(resistance != 0) {
            setResistance(resistance);
        }else{
            setResistance(5f);
        }

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Convergence.creativeTab);
    }
    @Override
    public void registerItemModel(Item itemBlock){
        Convergence.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}

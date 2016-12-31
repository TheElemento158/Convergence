package net.theelemento158.convergence.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;
import net.theelemento158.convergence.item.ItemOreDict;

public class BlockOre extends BlockBase implements ItemOreDict {
    private String oreName;

    public BlockOre(String name, String oreName, float hardness, float resistance, String toolClass, int harvestLevel) {
        super(Material.ROCK, name, hardness, resistance);

        this.oreName = oreName;

        setHarvestLevel(toolClass, harvestLevel);
        setHardness(hardness);
        setResistance(resistance);
    }

    @Override
    public void initOreDict(){
        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab){
        super.setCreativeTab(tab);
        return this;
    }
}

package net.theelemento158.convergence.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.theelemento158.convergence.item.ItemModelProvider;
import net.theelemento158.convergence.item.ItemOreDict;

public class ModBlocks {
    public static BlockOre oreVoid;
    //public static BlockBase oreCopper;
    public static BlockCropCorn cropCorn;
    //public static BlockPedestal pedestal;

    public static void init(){
        //oreCopper = register(new BlockBase(Material.ROCK, "oreCopper", 0, 0));
        oreVoid = register(new BlockOre("oreVoid", "oreVoid", 100f, 1000f, "pickaxe", 3));
        cropCorn = register(new BlockCropCorn(), null);
        //pedestal = register(new BlockPedestal());
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock){
        GameRegistry.register(block);
        if (itemBlock != null) {
            GameRegistry.register(itemBlock);
            if (block instanceof ItemModelProvider) {
                ((ItemModelProvider)block).registerItemModel(itemBlock);
            }
            if (block instanceof ItemOreDict){
                ((ItemOreDict)block).initOreDict();
            }
            if (itemBlock instanceof ItemOreDict){
                ((ItemOreDict)itemBlock).initOreDict();
            }
        }
        return block;
    }

    private static <T extends Block> T register(T block){
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}

package net.theelemento158.convergence.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.theelemento158.convergence.Convergence;
import net.theelemento158.convergence.item.tool.*;

public class ModItems {
   // public static ItemBase ingotCopper;
    public static ItemCornSeed cornSeed;
    public static ItemCorn corn;
    public static ItemSword copperSword;
    public static ItemPickaxe copperPickaxe;
    public static ItemAxe copperAxe;
    public static ItemShovel copperShovel;
    public static ItemHoe copperHoe;
    public static ItemArmor copperHelmet;
    public static ItemArmor copperChestplate;
    public static ItemArmor copperLeggings;
    public static ItemArmor copperBoots;

    public static void init(){
        //ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
        copperHelmet = register(new ItemArmor(Convergence.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copperHelmet"));
        copperChestplate = register(new ItemArmor(Convergence.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copperChestplate"));
        copperLeggings = register(new ItemArmor(Convergence.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copperLeggings"));
        copperBoots = register(new ItemArmor(Convergence.copperArmorMaterial, EntityEquipmentSlot.FEET, "copperBoots"));
        copperAxe = register(new ItemAxe(Convergence.copperToolMaterial, "copperAxe"));
        copperHoe = register(new ItemHoe(Convergence.copperToolMaterial, "copperHoe"));
        copperPickaxe = register(new ItemPickaxe(Convergence.copperToolMaterial, "copperPickaxe"));
        copperShovel = register(new ItemShovel(Convergence.copperToolMaterial, "copperShovel"));
        copperSword = register(new ItemSword(Convergence.copperToolMaterial, "copperSword"));
        cornSeed = register(new ItemCornSeed());
        corn = register(new ItemCorn());
    }

    private static <T extends Item> T register (T item){
        GameRegistry.register(item);

        if(item instanceof ItemModelProvider){
            ((ItemModelProvider)item).registerItemModel(item);
        }
        if(item instanceof ItemOreDict){
            ((ItemOreDict)item).initOreDict();
        }

        return item;
    }
}

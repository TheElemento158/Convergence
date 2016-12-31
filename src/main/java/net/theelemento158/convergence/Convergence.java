package net.theelemento158.convergence;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.theelemento158.convergence.block.ModBlocks;
import net.theelemento158.convergence.client.ConvergenceTab;
import net.theelemento158.convergence.item.ModItems;
import net.theelemento158.convergence.proxy.CommonProxy;
import net.theelemento158.convergence.recipe.ModRecipes;
import net.theelemento158.convergence.world.ModWorldGen;

@Mod(modid = Convergence.modId, name = Convergence.name, version = Convergence.version, acceptedMinecraftVersions = "[1.10.2]")
public class Convergence {
    public static final String modId = "convergence";
    public static final String name = "Convergence";
    public static final String version = "0.0.1a";
    public static final ConvergenceTab creativeTab = new ConvergenceTab();
    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
    public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", modId + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

    @SidedProxy(serverSide = "net.theeelemento158.convergence.proxy.CommonProxy", clientSide = "net.theelemento158.convergence.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static Convergence instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        System.out.println(name + " is loading!");
        ModBlocks.init();
        ModItems.init();
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}

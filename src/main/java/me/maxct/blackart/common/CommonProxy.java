package me.maxct.blackart.common;

import me.maxct.blackart.block.BlockLoader;
import me.maxct.blackart.crafting.CraftingLoader;
import me.maxct.blackart.creativetab.CreativeTabsBlackart;
import me.maxct.blackart.creativetab.CreativeTabsLoader;
import me.maxct.blackart.item.ItemLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * proxy class
 * Created by imaxct on 17-2-25.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
    }

    public void init(FMLInitializationEvent event){
        new CraftingLoader();
    }

    public void postInit(FMLPostInitializationEvent event){

    }
}

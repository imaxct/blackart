package me.maxct.blackart.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by imaxct on 17-2-27.
 */
public class CreativeTabsLoader {
    public static CreativeTabs tabBlackart;

    public CreativeTabsLoader(FMLPreInitializationEvent event){
        tabBlackart = new CreativeTabsBlackart();
    }
}

package me.maxct.blackart;

import me.maxct.blackart.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Main class of black art.
 * Created by imaxct on 17-2-25.
 */
@Mod(modid = BlackArt.MODID, name = BlackArt.NAME, version = BlackArt.VERSION, acceptedMinecraftVersions = "1.8.9")
public class BlackArt {
    public static final String MODID = "blackart";
    public static final String NAME = "Black Art";
    public static final String VERSION = "1.0";

    @Mod.Instance(BlackArt.MODID)
    public static BlackArt instance;

    @SidedProxy(clientSide = "me.maxct.blackart.client.ClientProxy", serverSide = "me.maxct.blackart.common.CommonProxy.java")
    public static CommonProxy proxy;

    /**
     * load config file, new instance of things and blocks and register them.
     * */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);
    }

    /**
     * register the forging table smelting table and interact with other mods.
     * */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    /**
     * receive interaction messages from other mods.
     * */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}

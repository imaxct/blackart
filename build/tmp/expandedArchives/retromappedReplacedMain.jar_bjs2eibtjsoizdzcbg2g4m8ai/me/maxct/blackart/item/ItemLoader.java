package me.maxct.blackart.item;

import me.maxct.blackart.block.BlockLoader;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * loader of item, initialize all items.
 * Created by imaxct on 17-2-25.
 */
public class ItemLoader {

    public static ItemGoldenEgg goldenEgg = new ItemGoldenEgg();

    public ItemLoader(FMLPreInitializationEvent event){
        register(goldenEgg, "golden_egg");
    }

    @SideOnly(Side.CLIENT)
    public static void  registerRenders(){
        registerRender(goldenEgg);
    }

    private static void register(Item item, String name){
        GameRegistry.registerItem(item, name);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item){
        String name = GameData.getItemRegistry().func_177774_c(item).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }
}

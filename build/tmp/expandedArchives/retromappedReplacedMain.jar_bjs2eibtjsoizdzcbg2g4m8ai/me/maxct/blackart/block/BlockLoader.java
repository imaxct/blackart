package me.maxct.blackart.block;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * load all blocks.
 * Created by imaxct on 17-2-26.
 */
public class BlockLoader {
    public static BlockExpOre expOre = new BlockExpOre();

    public BlockLoader(FMLPreInitializationEvent event){
        register(expOre, "exp_ore");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(expOre);
    }

    private static void register(Block block, String name){
        GameRegistry.registerBlock(block, name);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Block block){
        Item item = Item.func_150898_a(block);
        String name = GameData.getBlockRegistry().func_177774_c(block).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }
}

package me.maxct.blackart.crafting;

import me.maxct.blackart.item.ItemLoader;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by imaxct on 17-2-27.
 */
public class CraftingLoader {
    public CraftingLoader(){
        registerRecipe();
        registerSmelting();
        registerFuel();
    }

    private static void registerRecipe(){
        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.goldenEgg),
                "###", "#*#", "###",
                '#', Items.gold_ingot,
                '*', Items.egg);
    }

    private static void registerSmelting(){

    }

    private static void registerFuel(){

    }
}

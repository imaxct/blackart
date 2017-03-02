package me.maxct.blackart.block;

import me.maxct.blackart.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * exp ore
 * Created by imaxct on 17-2-25.
 */
public class BlockExpOre extends Block {
    public BlockExpOre(){
        super(Material.rock);
        this.setUnlocalizedName("expOre");
        this.setHardness(50);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabsLoader.tabBlackart);
    }
}

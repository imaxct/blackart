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
        super(Material.field_151576_e);
        this.func_149663_c("expOre");
        this.func_149711_c(50);
        this.func_149672_a(field_149769_e);
        this.func_149647_a(CreativeTabsLoader.tabBlackart);
    }
}

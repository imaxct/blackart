package me.maxct.blackart.creativetab;

import me.maxct.blackart.BlackArt;
import me.maxct.blackart.item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * customized creative table.
 * Created by imaxct on 17-2-27.
 */
public class CreativeTabsBlackart extends CreativeTabs {
    public CreativeTabsBlackart(){
        super(BlackArt.MODID);
    }

    @Override
    public Item func_78016_d() {
        return ItemLoader.goldenEgg;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}

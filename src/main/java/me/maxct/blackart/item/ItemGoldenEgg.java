package me.maxct.blackart.item;

import me.maxct.blackart.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

/**
 * Created by imaxct on 17-2-25.
 */
public class ItemGoldenEgg extends Item {
    public ItemGoldenEgg(){
        super();
        this.setUnlocalizedName("goldenEgg");
        this.setCreativeTab(CreativeTabsLoader.tabBlackart);
    }
}

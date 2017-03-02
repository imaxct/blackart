package me.maxct.blackart.item;

import me.maxct.blackart.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

/**
 * Created by imaxct on 17-2-25.
 */
public class ItemGoldenEgg extends Item {
    public ItemGoldenEgg(){
        super();
        this.func_77655_b("goldenEgg");
        this.func_77637_a(CreativeTabsLoader.tabBlackart);
    }
}

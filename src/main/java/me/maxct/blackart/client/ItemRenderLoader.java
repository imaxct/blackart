package me.maxct.blackart.client;

import me.maxct.blackart.block.BlockLoader;
import me.maxct.blackart.item.ItemLoader;

/**
 * item render loader
 * Created by imaxct on 17-2-25.
 */
public class ItemRenderLoader {

    public ItemRenderLoader(){
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}

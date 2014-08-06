package io.universalteam.runica.proxies;

import cpw.mods.fml.common.registry.GameRegistry;
import io.universalteam.runica.items.slates.BlankSlate;
import io.universalteam.runica.items.slates.FehuSlate;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CommonProxy {

    public static CreativeTabs tabRunica;

    public static Item blankSlate;
    public static Item fehuSlate;

    public void preInit() {
        initItems();
        initCreativeTabs();
    }

    public void Init() {
    }

    public void postInit() {
    }

    protected void initItems() {
        blankSlate = new BlankSlate();
        fehuSlate = new FehuSlate();

        GameRegistry.registerItem(blankSlate, "blankSlate");
        GameRegistry.registerItem(fehuSlate, "fehuSlate");
    }

    protected void initCreativeTabs() {
        tabRunica = new CreativeTabs("tabRunica") {
            @Override
            public Item getTabIconItem() {
                return fehuSlate;
            }
        };
    }
}

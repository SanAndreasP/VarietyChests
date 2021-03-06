/*******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.varietychests.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class VcCreativeTab
        extends CreativeTabs
{
    private ItemStack[] tabIcons;

    public VcCreativeTab() {
        super(VarietyChests.MOD_ID + ":vcm_tab");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        if( this.tabIcons == null ) {
            ChestType[] types = ChestType.getTypes();
            this.tabIcons = new ItemStack[types.length];
            for( int i = 0; i < types.length; i++ ) {
                this.tabIcons[i] = ChestType.getNewItemStackFromType(VarietyChests.customChest, types[i], 1);
            }
        }

        return this.tabIcons[(int) (System.currentTimeMillis() / 4250) % this.tabIcons.length];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(VarietyChests.customChest);
    }
}

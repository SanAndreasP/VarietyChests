/*******************************************************************************************************************
 * Authors:   SanAndreasP
 * Copyright: SanAndreasP, SilverChiren and CliffracerX
 * License:   Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 *                http://creativecommons.org/licenses/by-nc-sa/4.0/
 *******************************************************************************************************************/
package de.sanandrew.mods.varietychests.client.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.sanandrew.mods.varietychests.util.VarietyChests;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class Textures
{
    public static final ResourceLocation CHEST_GLOWMAP_SNG = new ResourceLocation(VarietyChests.MOD_ID, "textures/entity/chest/glow_engrave.png");
    public static final ResourceLocation CHEST_GLOWMAP_DBL = new ResourceLocation(VarietyChests.MOD_ID, "textures/entity/chest/glow_engrave_double.png");
    public static final ResourceLocation CHEST_TRAPMAP_SNG = new ResourceLocation(VarietyChests.MOD_ID, "textures/entity/chest/trap_engrave.png");
    public static final ResourceLocation CHEST_TRAPMAP_DBL = new ResourceLocation(VarietyChests.MOD_ID, "textures/entity/chest/trap_engrave_double.png");
}

package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.Investiture;
import com.orangeysnicket.investiture.entity.EntityAshSprinkle;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHangingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAshSprinkle extends ItemHangingEntity {


    public ItemAshSprinkle(String registryName, String unlocalizedName) {
        super(EntityAshSprinkle.class);
        setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(Investiture.decoTab);
        this.setMaxStackSize(64);
    }

}

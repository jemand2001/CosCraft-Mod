package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.block.AshLayer;
import com.orangeysnicket.investiture.init.ModBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSnow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAshLayer extends ItemSnow {
    public ItemAshLayer() {
        super(ModBlocks.ASH_LAYER);
    }

    public int getMetadata(int damage)
    {
        return damage;
    }

    public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack)
    {
        IBlockState state = world.getBlockState(pos);
        return (state.getBlock() == ModBlocks.ASH_LAYER && ((Integer) state.getValue(AshLayer.LAYERS)) <= 7) || super.canPlaceBlockOnSide(world, pos, side, player, stack);
    }

}

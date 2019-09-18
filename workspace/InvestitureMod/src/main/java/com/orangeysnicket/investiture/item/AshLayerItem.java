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
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AshLayerItem extends ItemBlock {
    public AshLayerItem() {
        super(ModBlocks.ASH_LAYER);
        this.setMaxDamage(0);
    }

    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        ItemStack itemstack = player.getHeldItem(hand);

        if (!itemstack.isEmpty() && player.canPlayerEdit(pos, facing, itemstack))
        {
            IBlockState blockState1 = worldIn.getBlockState(pos);
            Block block = blockState1.getBlock();
            BlockPos blockpos = pos;

            if ((facing != EnumFacing.UP || block != this.block) && !block.isReplaceable(worldIn, pos))
            {
                blockpos = pos.offset(facing);
                blockState1 = worldIn.getBlockState(blockpos);
                block = blockState1.getBlock();
            }

            if (block == this.block)
            {
                int i = blockState1.getValue(AshLayer.LAYERS);

                if (i < 8)
                {
                    IBlockState blockState2 = blockState1.withProperty(AshLayer.LAYERS, i + 1);
                    AxisAlignedBB axisalignedbb = blockState2.getCollisionBoundingBox(worldIn, blockpos);

                    if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(blockpos)) && worldIn.setBlockState(blockpos, blockState2, 10))
                    {
                        SoundType soundtype = this.block.getSoundType(blockState2, worldIn, pos, player);
                        worldIn.playSound(player, blockpos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

                        if (player instanceof EntityPlayerMP)
                        {
                            CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos, itemstack);
                        }

                        itemstack.shrink(1);
                        return EnumActionResult.SUCCESS;
                    }
                }
            }

            return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
        }
        else
        {
            return EnumActionResult.FAIL;
        }
    }

    public int getMetadata(int damage)
    {
        return damage;
    }

    public boolean canPlaceBlockOnSide(World world, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack)
    {
        IBlockState state = world.getBlockState(pos);
        return (state.getBlock() == net.minecraft.init.Blocks.SNOW_LAYER && ((Integer) state.getValue(AshLayer.LAYERS)) <= 7) || super.canPlaceBlockOnSide(world, pos, side, player, stack);
    }

}

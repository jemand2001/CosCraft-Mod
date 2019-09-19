package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class AshLayer extends BlockSnow {
    public static final PropertyInteger LAYERS = PropertyInteger.create("layers", 1, 8);

    public AshLayer() {
        super();
        this.setDefaultState(this.blockState.getBaseState().withProperty(LAYERS, 1));
        setCreativeTab(Investiture.decoTab);
        setSoundType(SoundType.SNOW);
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, LAYERS);
    }

}

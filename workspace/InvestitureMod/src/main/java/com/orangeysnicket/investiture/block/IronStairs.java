package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;

public class IronStairs extends BlockStairs{
	
	public IronStairs(IBlockState modelState) {
		super(modelState);
		setCreativeTab(Investiture.investitureTab);
		setSoundType(SoundType.METAL);
		this.useNeighborBrightness = true;
	}

}
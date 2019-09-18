package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class TinStairs extends BlockStairs{
	
	public TinStairs(IBlockState modelState) {
		super(modelState);
		setCreativeTab(Investiture.investitureTab);
		setSoundType(SoundType.METAL);
		this.useNeighborBrightness = true;
	}
	
}
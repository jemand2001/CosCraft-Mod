package com.orangeysnicket.investiture.item;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.item.Item;


public class BendalloyIngot extends Item {

	public BendalloyIngot(String registryName, String unlocalizedName) {
		setTranslationKey(Investiture.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(Investiture.investitureTab);
	}
}


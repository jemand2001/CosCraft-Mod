package com.orangeysnicket.investiture.block;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.SoundType;

public class AshLayer extends BlockSnow {
    public AshLayer() {
        super();
        setCreativeTab(Investiture.decoTab);
        setSoundType(SoundType.SNOW);
    }
}

package com.orangeysnicket.investiture.entity;

import com.orangeysnicket.investiture.Investiture;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class MistWraith extends EntityCreature {
    public static final ResourceLocation LOOT = new ResourceLocation(Investiture.MODID + "entities/mistwraith");

    public MistWraith(World worldIn) {
        super(worldIn);
        setSize(1, 1);
    }

    @Override
    protected void entityInit() {
        super.entityInit();
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.applyEntityAI();
    }

    protected void applyEntityAI() {

    }

    @Override
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
}

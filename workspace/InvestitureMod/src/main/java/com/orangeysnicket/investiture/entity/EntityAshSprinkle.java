package com.orangeysnicket.investiture.entity;


import com.orangeysnicket.investiture.Investiture;
//import net.minecraft.command.server.CommandMessage;
//import net.minecraft.command.server.CommandMessageRaw;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.HangingEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;

public class EntityAshSprinkle extends HangingEntity {

    protected EntityAshSprinkle(EntityType<? extends HangingEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    public int getWidthPixels() {
        return 16;
    }

    @Override
    public int getHeightPixels() {
        return 16;
    }

    @Override
    public void onBroken(@Nullable Entity brokenEntity) {

    }

    @Override
    public void playPlaceSound() {

    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return null;
    }
}

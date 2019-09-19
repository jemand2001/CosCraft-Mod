package com.orangeysnicket.investiture.entity;


import com.orangeysnicket.investiture.Investiture;
import net.minecraft.command.server.CommandMessage;
import net.minecraft.command.server.CommandMessageRaw;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityHanging;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class EntityAshSprinkle extends EntityHanging {

    private static Logger logger = Investiture.getLogger();

    public EntityAshSprinkle(World worldIn) {
        super(worldIn);
        this.setSize(1, 1);

        logger.log(Level.WARN, "Initialising EntityAshSprinkle");
    }

    @Override
    public int getWidthPixels() {
        return 12;
    }

    @Override
    public int getHeightPixels() {
        return 12;
    }

    @Override
    public void onBroken(Entity brokenEntity) {
        // Validate.notNull(brokenEntity, "brokenEntity was NULL");
        //FIXME this shouldn't happen, so why does it
        if (brokenEntity == null) {
            logger.error("For some reason brokenEntity is null");
            return;
        }
        logger.warn("Killing EntityAshSprinkle {}", brokenEntity.getName());
    }

    @Override
    public void playPlaceSound() {

    }

}

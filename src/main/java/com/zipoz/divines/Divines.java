package com.zipoz.divines;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class Divines {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MODID);
    public Divines() {
        LOGGER.debug("divines!");
    }
}

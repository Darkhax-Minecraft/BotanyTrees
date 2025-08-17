package net.darkhax.botanytrees.common.impl;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BotanyTrees {

    public static final String MOD_ID = "botanytrees";
    public static final String MOD_NAME = "BotanyTrees";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
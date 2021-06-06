package com.nomomojo.getbrickd.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RedSidingBlock extends Block {
    public RedSidingBlock(){
        super(Properties.create(Material.WOOD)
                .hardnessAndResistance(0.8f, 3.0f)
                .sound(SoundType.BAMBOO)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE));
    }
}

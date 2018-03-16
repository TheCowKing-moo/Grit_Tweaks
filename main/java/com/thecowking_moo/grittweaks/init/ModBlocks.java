package com.thecowking_moo.grittweaks.init;

import java.util.ArrayList;
import java.util.List;

import com.thecowking_moo.grittweaks.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COMPRESSED_STEEL = new BlockBase("compressed_steel", Material.IRON);
	public static final Block DOUBLE_COMPRESSED_STEEL = new BlockBase("double_compressed_steel", Material.IRON);
	public static final Block TRIPLE_COMPRESSED_STEEL = new BlockBase("triple_compressed_steel", Material.IRON);

}

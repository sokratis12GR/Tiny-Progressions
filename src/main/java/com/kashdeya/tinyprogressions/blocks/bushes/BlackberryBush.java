package com.kashdeya.tinyprogressions.blocks.bushes;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechFoods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlackberryBush extends BlockBerryBush {

	public BlackberryBush() {
		super();
		this.setUnlocalizedName("blackberry_bush");
	}

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return TechFoods.blackberry_berry;
    }
	
}
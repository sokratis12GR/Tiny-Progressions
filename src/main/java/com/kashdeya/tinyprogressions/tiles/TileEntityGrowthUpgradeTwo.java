package com.kashdeya.tinyprogressions.tiles;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityGrowthUpgradeTwo extends TileEntity implements ITickable {

	public int animationTicks, prevAnimationTicks;

	public TileEntityGrowthUpgradeTwo() {
	}

	@Override
	public void update() {
		if (worldObj.isRemote) {
			prevAnimationTicks = animationTicks;
			if (animationTicks < 360)
				animationTicks += 5;
			if (animationTicks >= 360) {
				animationTicks -= 360;
				prevAnimationTicks -= 360;
			}
		}
	}
}

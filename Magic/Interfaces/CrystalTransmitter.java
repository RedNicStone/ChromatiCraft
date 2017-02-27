/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2016
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ChromatiCraft.Magic.Interfaces;

public interface CrystalTransmitter extends CrystalNetworkTile, EnergyBeamRenderer {

	public int getSendRange();

	public boolean needsLineOfSightToReceiver(CrystalReceiver r);

	public boolean canTransmitTo(CrystalReceiver r);

	public int getPathPriority();
}

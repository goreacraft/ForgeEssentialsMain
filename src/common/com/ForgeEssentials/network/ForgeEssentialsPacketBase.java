package com.ForgeEssentials.network;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Packet250CustomPayload;
import net.minecraft.src.WorldClient;
import net.minecraft.src.WorldServer;

public abstract class ForgeEssentialsPacketBase extends Packet250CustomPayload
{
	public static final String FECHANNEL = "ForgeEssentials";

	public abstract void readServer(DataInputStream stream, WorldServer world, EntityPlayer player) throws IOException;

	@SideOnly(value = Side.CLIENT)
	public abstract void readClient(DataInputStream stream, WorldClient world, EntityPlayer player) throws IOException;
}

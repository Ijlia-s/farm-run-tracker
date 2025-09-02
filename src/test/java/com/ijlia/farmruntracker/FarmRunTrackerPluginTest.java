package com.ijlia.farmruntracker;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FarmRunTrackerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FarmRunTrackerPlugin.class);
		RuneLite.main(args);
	}
}
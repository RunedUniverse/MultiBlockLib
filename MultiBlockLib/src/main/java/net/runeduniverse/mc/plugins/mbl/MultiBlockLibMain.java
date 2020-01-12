package net.runeduniverse.mc.plugins.mbl;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.dependency.SoftDependency;
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion.Target;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

import net.runeduniverse.mc.plugins.mbl.addons.SnowflakeAddon;
import net.runeduniverse.mc.plugins.mbl.api.MBLManager;
import net.runeduniverse.mc.plugins.mbl.api.MultiBlockLib;
import net.runeduniverse.mc.plugins.snowflake.api.Snowflake;
import net.runeduniverse.mc.plugins.snowflake.api.exceptions.SnowflakeInconsistentException;
import net.runeduniverse.mc.plugins.snowflake.api.exceptions.SnowflakeNotFoundException;

@Plugin(name = "MultiBlockLib", version = "0.0.1")
@Description(value = "MultiBlockLib provides the ability to create Multi-Block Structures")
@Author(value = "[RunedUniverse] Pl4yingNight")
@ApiVersion(Target.v1_13)
@SoftDependency("Snowflake")
public class MultiBlockLibMain extends JavaPlugin implements MultiBlockLib {
	
	private MBLManager manager = null;
	
	// addons
	SnowflakeAddon sfAddon = null;
	
	@Override
	public void onLoad() {
		loadAddons();
		
		getLogger().info("Loaded");
	}

	@Override
	public void onEnable() {

		getLogger().info("Enabled");
	}

	@Override
	public void onDisable() {
		
		getLogger().info("Disabled");
	}

	@Override
	public MBLManager getManager() {
		return this.manager;
	}
	
	private void loadAddons() {
		try {
			this.sfAddon = new SnowflakeAddon(Snowflake.extract(this));
			getLogger().info("Snowflake-Addon loaded");
		} catch (SnowflakeNotFoundException | SnowflakeInconsistentException e) {
			getLogger().info("MultiBlockLib starting without Snowflake");
		}
		
		
		
		
	}

}

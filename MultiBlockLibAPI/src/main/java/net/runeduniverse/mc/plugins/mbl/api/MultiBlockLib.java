package net.runeduniverse.mc.plugins.mbl.api;

import org.bukkit.plugin.Plugin;

import net.runeduniverse.mc.plugins.mbl.api.exceptions.MBLInconsistentException;
import net.runeduniverse.mc.plugins.mbl.api.exceptions.MBLNotFoundException;

public interface MultiBlockLib extends Plugin {

	public MBLManager getManager();

	public static MultiBlockLib extract(Plugin plugin) throws MBLNotFoundException, MBLInconsistentException{
		Plugin mblTemplate = plugin.getServer().getPluginManager().getPlugin("MultiBlockLib");

		if (mblTemplate == null)
			throw new MBLNotFoundException("MultiBlockLib-Plugin is not loaded");

		if (!(mblTemplate instanceof MultiBlockLib))
			throw new MBLInconsistentException("preloaded MultiBlockLib-Plugin does not match the requirements!");

		return (MultiBlockLib) mblTemplate;
	}
}

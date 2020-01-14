package net.runeduniverse.mc.plugins.mbl.api.structure;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;

public interface TemplateStructure {
	// Setter
	public void setTemplate(TemplateBlock[][][] blocks);
	
	// Check
	public void isValid(BlockFace blockFace, Block formingBlock);
}

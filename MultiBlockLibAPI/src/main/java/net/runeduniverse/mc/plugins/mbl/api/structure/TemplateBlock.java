package net.runeduniverse.mc.plugins.mbl.api.structure;

import org.bukkit.Material;

public interface TemplateBlock {
	// Getter
	public Material[] getMaterial();
	
	// Setter
	public void setMaterial(Material... materials);
	public void setFormingBlock(Boolean active);
	public void setInterfaceBlock(Boolean active);
	
	// Check
	public Boolean validateMaterial(Material material);
	public Boolean isFormingBlock();
	public Boolean isInterfaceBlock();
}

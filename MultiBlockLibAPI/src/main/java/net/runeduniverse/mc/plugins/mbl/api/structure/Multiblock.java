package net.runeduniverse.mc.plugins.mbl.api.structure;

import org.bukkit.NamespacedKey;

public interface Multiblock {

	// Getter
	public TemplateStructure getStructure();
	public NamespacedKey getFormingTool();
	public InterfaceType getInterfaceType();
	
	// Setter
	public void setStructure(TemplateStructure struct);
	public void setFormingTool(NamespacedKey key);
	public void setInterfaceType(InterfaceType type);
	
}

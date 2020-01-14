package net.runeduniverse.mc.plugins.mbl.api.structure;

import org.bukkit.event.inventory.InventoryType;

public enum InterfaceType {
	PLAYER_CRAFTING(InventoryType.CRAFTING),
	WORKBENCH(InventoryType.WORKBENCH),
	FURNACE(InventoryType.FURNACE),
	BREWING(InventoryType.BREWING),
	ANVIL(InventoryType.ANVIL),
	BLAST_FURNACE(InventoryType.BLAST_FURNACE),
	SMOKER(InventoryType.SMOKER),
	LOOM(InventoryType.LOOM),
	CARTOGRAPHY(InventoryType.CARTOGRAPHY),
	GRINDSTONE(InventoryType.GRINDSTONE),
	STONECUTTER(InventoryType.STONECUTTER);
	
	private InventoryType invType;
	
	private InterfaceType(InventoryType invType) {
		this.invType = invType;
	}
	
	public InventoryType getInvType() {
		return this.invType;
	}
	
	
}

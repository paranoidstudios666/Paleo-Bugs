
package net.mcreator.paleobugs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SuspiciousAmberItem extends Item {
	public SuspiciousAmberItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}

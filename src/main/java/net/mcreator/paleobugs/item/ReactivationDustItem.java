
package net.mcreator.paleobugs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReactivationDustItem extends Item {
	public ReactivationDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}

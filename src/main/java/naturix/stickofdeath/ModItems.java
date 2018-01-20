package naturix.stickofdeath;

import naturix.stickofdeath.item.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

	public static ItemBase stickOfDeath = new ItemBase("stick_death").setCreativeTab(CreativeTabs.COMBAT);

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				stickOfDeath
		);
	}

	public static void registerModels() {
		stickOfDeath.initModel();
	}
}
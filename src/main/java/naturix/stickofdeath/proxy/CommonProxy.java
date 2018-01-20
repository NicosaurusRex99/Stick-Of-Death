package naturix.stickofdeath.proxy;

import java.io.File;

import naturix.stickofdeath.Config;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

	@Mod.EventBusSubscriber
	public class CommonProxy {
		public static Configuration config;
		public void preInit(FMLPreInitializationEvent e) {
			File directory = e.getModConfigurationDirectory();
	        config = new Configuration(new File(directory.getPath(), "naturix/Stick Of Death.cfg"));
	        Config.readConfig();
	    }

	    public void init(FMLInitializationEvent e) {
	    }

	    public void postInit(FMLPostInitializationEvent e) {
	    	if (config.hasChanged()) {
	            config.save();
	        }
	    }

	    public void registerItemRenderer(Item item, int meta, String id) {
	    }
	}


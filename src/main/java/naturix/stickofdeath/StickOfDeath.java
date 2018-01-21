package naturix.stickofdeath;

import org.apache.logging.log4j.Logger;

import naturix.stickofdeath.proxy.CommonProxy;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = StickOfDeath.MODID, name = StickOfDeath.NAME, version = StickOfDeath.VERSION)
public class StickOfDeath
{
	public static final String MODID = "stickofdeath";
    public static final String NAME = "Stick of Death";
    public static final String VERSION = "1.12.2.0";

    public static final Item.ToolMaterial SODToolMaterial = EnumHelper.addToolMaterial("SOD", 9001, 4096, 40, 8997, 42);
    
    @SidedProxy(clientSide = "naturix.stickofdeath.proxy.ClientProxy", serverSide = "naturix.stickofdeath.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static StickOfDeath instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    @Mod.EventBusSubscriber
	public static class RegistrationHandler {
	
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
	
	}
}

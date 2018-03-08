package naturix.stickofdeath;

import org.apache.logging.log4j.Level;

import naturix.stickofdeath.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class Config {

    private static final String CATEGORY_GENERAL = "general";
    public static boolean opStick; 
    public static boolean troll;
    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
            StickOfDeath.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        opStick = cfg.getBoolean("opStick", CATEGORY_GENERAL, true, "set to false for a weaker stick");
        troll = cfg.getBoolean("troll", CATEGORY_GENERAL, true, "set to false to remove the troll");
        }


}
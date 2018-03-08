package naturix.stickofdeath;

import naturix.stickofdeath.item.StickOfDeathStick;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	@GameRegistry.ObjectHolder("stickofdeath:stick_death")
    public static StickOfDeathStick stickdeath;
	
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        stickdeath.initModel();
    }
}
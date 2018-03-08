package naturix.stickofdeath;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
@Mod.EventBusSubscriber(modid = StickOfDeath.MODID)
public final class ModSounds {
	public static final SoundEvent rickroll = makeSoundEvent("rickroll");

	private static SoundEvent makeSoundEvent(String name) {
		ResourceLocation loc = new ResourceLocation(StickOfDeath.MODID, name);
		return new SoundEvent(loc).setRegistryName(loc);
	}
	
	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> evt) {
		IForgeRegistry<SoundEvent> r = evt.getRegistry();
		r.register(rickroll);

	}

	private ModSounds() {}
}
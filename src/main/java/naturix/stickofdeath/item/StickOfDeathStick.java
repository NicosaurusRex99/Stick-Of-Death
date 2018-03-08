package naturix.stickofdeath.item;

import java.util.Random;

import naturix.stickofdeath.Config;
import naturix.stickofdeath.ModSounds;
import naturix.stickofdeath.StickOfDeath;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class StickOfDeathStick extends ItemSword {

	private Random rand;

	public StickOfDeathStick() {
		super(StickOfDeath.SODToolMaterial);
		setRegistryName("stick_death");
        setUnlocalizedName(StickOfDeath.MODID + ".stick_death");
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}
	
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		float var4 = 1.0F;
		ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
		int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
		int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D);
		int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);
			if (Config.troll = true) {
				entity.playSound(ModSounds.rickroll, 0.8F, 1F);
			}
		return ar;
	}
}
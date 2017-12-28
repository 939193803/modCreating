package baubles.common.items;

import baubles.common.Baubles;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTest extends Item//new
{
	@GameRegistry.ObjectHolder(Baubles.MODID + ":test")
	public static final Item TEST = null;
	public  ItemTest()
	{
		super();
		this.setMaxStackSize(5);
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().register((new ItemRing()).setUnlocalizedName("Test").setRegistryName("test"));
	}
}

package baubles.common.items;

import baubles.common.Baubles;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemTest extends Item {
	@GameRegistry.ObjectHolder(Baubles.MODID + ":test")
	public static Item test = null;
	
	public ItemTest()
	{
		this.setCreativeTab(CreativeTabs.SEARCH);
		this.setMaxStackSize(64);
		this.setMaxDamage(0);
	}
	@SubscribeEvent
	public static void Register(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new ItemTest().setUnlocalizedName("Test").setRegistryName("test"));
	}
}
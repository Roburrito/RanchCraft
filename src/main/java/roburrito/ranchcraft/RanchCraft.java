package roburrito.ranchcraft;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import roburrito.ranchcraft.item.ModItems;
import roburrito.ranchcraft.proxy.CommonProxy;

@Mod(modid = RanchCraft.MODID, version = RanchCraft.VERSION)
public class RanchCraft
{
    public static final String MODID = "ranchcraft";
    public static final String NAME = "RanchCraft";
    public static final String VERSION = "1.0";
    
    @Instance(MODID)
    public static RanchCraft instance;
    
    @SidedProxy(serverSide = "roburrito.ranchcraft.proxy.CommonProxy", clientSide = "roburrito.ranchcraft.proxy.ClientProxy")
	public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLInitializationEvent event) {
    	System.out.println(NAME + " is entering preInit!");
        ModItems.init();
    }
}

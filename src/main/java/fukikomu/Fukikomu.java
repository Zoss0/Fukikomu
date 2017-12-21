package fukikomu;

import fukikomu.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Fukikomu.MODID, name = Fukikomu.MODNAME, version = Fukikomu.VERSION)
public class Fukikomu
{
    public static final String MODID = "fukikomu";
    public static final String MODNAME = "Fukikomu";
    public static final String VERSION = "0.0.1";

    @SidedProxy(clientSide = "fukikomu.proxy.ClientProxy", serverSide = "fukikomu.proxy.Serverproxy")
    public static CommonProxy proxy;

    @Instance
    public static Fukikomu instance;
    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //IDE is retard?
        logger = event.getModLog();
        proxy.preInit(event);
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}

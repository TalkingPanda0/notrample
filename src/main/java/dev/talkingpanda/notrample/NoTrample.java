package dev.talkingpanda.notrample;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = NoTrample.MODID, name = NoTrample.NAME, version = NoTrample.VERSION,acceptableRemoteVersions = "*",acceptableSaveVersions = "*")
public class NoTrample
{
    public static final String MODID = "notrample";
    public static final String NAME = "No Trample";
    public static final String VERSION = "1.0";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("HOUSE HOUSEING...");
        MinecraftForge.EVENT_BUS.register(EventListener.class);
    }

}

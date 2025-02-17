package dev.talkingpanda.notrample;

import net.minecraft.block.state.IBlockState;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventListener {

    @SubscribeEvent
    public static void onTrample(BlockEvent.FarmlandTrampleEvent event){
        final IBlockState state = event.getState();
        event.getWorld().notifyBlockUpdate(event.getPos(),state,state,0);
        event.setCanceled(true);

    }
}


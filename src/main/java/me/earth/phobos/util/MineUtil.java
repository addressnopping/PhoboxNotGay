package me.earth.phobos.util;

import net.minecraft.network.play.client.CPacketHeldItemChange;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.client.Minecraft;

public class MineUtil {

public static final Minecraft mc;
  
public static void switchToSlot(final int slot) {
        MineUtil.mc.player.connection.sendPacket((Packet)new CPacketHeldItemChange(slot));
        MineUtil.mc.player.inventory.currentItem = slot;
        MineUtil.mc.playerController.updateController();
    }

    static {
        mc = Minecraft.getMinecraft();
    }
}

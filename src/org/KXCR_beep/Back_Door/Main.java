package org.KXCR_beep.Back_Door;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin Enable");
        getServer().getPluginManager().registerEvents(new MyListener(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("Plugin Disable");
    }
}

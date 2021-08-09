package epl.hum.toooor;

import org.bukkit.plugin.java.JavaPlugin;

public final class Toooor extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.BLUE + "Goaaaaaaaaaal!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

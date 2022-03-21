package me.test.dunger;

import org.bukkit.plugin.java.JavaPlugin;

public final class Dunger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("[FirstPlugin] Hello!");

        getServer().getPluginManager().registerEvents(new BreakBlock(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic//
        System.out.println("[FirstPlugin] Good Bye!");
    }
}
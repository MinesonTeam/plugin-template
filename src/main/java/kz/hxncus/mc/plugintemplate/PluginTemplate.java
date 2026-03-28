package kz.hxncus.mc.plugintemplate;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginTemplate extends JavaPlugin {

    @Getter
    private static PluginTemplate instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
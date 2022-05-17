package tppluginfixedversion.tppluginfixedversion;

import org.bukkit.plugin.java.JavaPlugin;

public final class TpPluginFixedVersion extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("rtp").setExecutor(new TpPluginFixedVersionCommand());

    }
}

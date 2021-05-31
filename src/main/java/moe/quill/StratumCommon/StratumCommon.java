package moe.quill.StratumCommon;

import moe.quill.StratumCommon.Serialization.StratumSerialization;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;


public class StratumCommon extends JavaPlugin {

    @Override
    public void onEnable() {
        final var servicesManager = getServer().getServicesManager();
        servicesManager.register(StratumSerialization.class, StratumSerialization.getInstance(), this, ServicePriority.Highest);
    }

    public void onDisable() {

    }
}

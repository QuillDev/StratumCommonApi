package moe.quill.StratumCommon.Plugin;

import moe.quill.StratumCommon.Database.IDatabaseService;
import moe.quill.StratumCommon.KeyManager.IKeyManager;
import moe.quill.StratumCommon.Serialization.ISerializer;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StratumPlugin extends JavaPlugin {

    private final StratumConfig stratumConfig;

    protected PluginManager pluginManager;
    protected final Logger logger = LoggerFactory.getLogger(getName());

    private IDatabaseService databaseService;
    private IKeyManager keyManager;
    private ISerializer serializer;

    public StratumPlugin(StratumConfig stratumConfig) {
        this.stratumConfig = stratumConfig;
        this.pluginManager = getServer().getPluginManager();
    }

    @Override
    public void onEnable() {
        super.onEnable();

        //Try to get any services we may need
        final var servicesManager = getServer().getServicesManager();

        //Get the database if we require it
        if (stratumConfig.isUseDatabase()) {
            final var dbRegistration = servicesManager.getRegistration(IDatabaseService.class);
            if (dbRegistration == null) {
                pluginManager.disablePlugin(this, true);
                return;
            }
            databaseService = dbRegistration.getProvider();
        }

        //get the key manager if we require it
        if (stratumConfig.isUseKeyManager()) {
            final var keyRegistration = servicesManager.getRegistration(IKeyManager.class);
            if (keyRegistration == null) {
                pluginManager.disablePlugin(this, true);
                return;
            }
            keyManager = keyRegistration.getProvider();
        }

        //get the key manager if we require it
        if (stratumConfig.isUseSerialization()) {
            final var serializerRegistration = servicesManager.getRegistration(ISerializer.class);
            if (serializerRegistration == null) {
                pluginManager.disablePlugin(this, true);
                return;
            }
            serializer = serializerRegistration.getProvider();
        }

    }

    /**
     * Get the KeyManger service found in all stratum plugins
     *
     * @return the key manager service
     */
    public IKeyManager getKeyManager() {
        if (!stratumConfig.isUseKeyManager()) {
            logger.error("KeyManger service is not enabled! Please enable it in the constructor config!");
            return null;
        }
        return keyManager;
    }

    /**
     * Get the database service found in all stratum plugins
     *
     * @return the database service
     */
    public IDatabaseService getDatabaseService() {
        if (!stratumConfig.isUseDatabase()) {
            logger.error("Database service is not enabled! Please enable it in the constructor config!");
            return null;
        }
        return databaseService;
    }

    /**
     * Get the database service found in all stratum plugins
     *
     * @return the database service
     */
    public ISerializer getSerializer() {
        if (!stratumConfig.isUseSerialization()) {
            logger.error("Serializer service is not enabled! Please enable it in the constructor config!");
            return null;
        }
        return serializer;
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}

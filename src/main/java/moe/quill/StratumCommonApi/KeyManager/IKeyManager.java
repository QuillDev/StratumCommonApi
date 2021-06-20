package moe.quill.StratumCommonApi.KeyManager;

import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;

public interface IKeyManager {

    HashMap<String, NamespacedKey> keyMap = new HashMap<>();

    void loadKeyablesDynamically(Plugin plugin);

    void registerKey(Plugin plugin, String string);

    <E extends Enum<?>> void loadPluginKeys(Plugin plugin, Class<E> enumClass);

    HashMap<String, NamespacedKey> getKeyMap();

    NamespacedKey getKey(Enum<?> keyEnum);
}

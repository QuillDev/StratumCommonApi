package moe.quill.StratumCommon.Managers;

import moe.quill.StratumCommon.Annotations.IgnoreDynamicLoading;
import moe.quill.StratumCommon.Annotations.Keyable;
import moe.quill.StratumCommon.PackageUtils;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;
import org.reflections.Reflections;

import java.util.HashMap;

@SuppressWarnings("unused")
public class KeyManager {

    private final Reflections reflections;
    private final Plugin plugin;
    private final HashMap<String, NamespacedKey> keys = new HashMap<>();
    private final String packageString;

    public KeyManager(Plugin plugin, String packageString) {
        this.packageString = packageString;
        this.reflections = new Reflections(packageString);
        this.plugin = plugin;
        doReflection();
    }

    public KeyManager(Plugin plugin) {
        this(plugin, PackageUtils.getCutPackageFromClass(plugin.getClass()));
    }

    private void doReflection() {
        System.out.println("Scanning " + packageString);
        reflections
                .getTypesAnnotatedWith(Keyable.class)
                .stream()
                .filter(keyClass -> !keyClass.isAnnotationPresent(IgnoreDynamicLoading.class))
//                .filter(keyClass -> {
//                    final var keyableAnnotation = keyClass.getAnnotation(Keyable.class);
//
//                    //Empty annotations are general and can be loaded by any plugin
//                    if (keyableAnnotation.pluginId().isEmpty()) {
//                        return true;
//                    }
//
//                    //Check if the plugin id in the annotation equals the plugin name
//                    return keyableAnnotation.pluginId().equalsIgnoreCase(plugin.getName());
//                })
                .forEach(keyClass -> {
                    //Get enum keys
                    final var keyObjects = (Enum<?>[]) keyClass.getEnumConstants();

                    //Create keys for all of the keys in this class
                    for (final var key : keyObjects) {
                        keys.putIfAbsent(key.name(), new NamespacedKey(plugin, key.name()));
                    }
                });
    }

    /**
     * Get all keys that have been registered with the key manager
     *
     * @return a list of registered keys
     */
    public HashMap<String, NamespacedKey> getKeys() {
        return keys;
    }

    public NamespacedKey getNsKey(String query) {
        return keys.get(query);
    }

    public <E extends Enum<E>> NamespacedKey getNsKey(Enum<E> materialKey) {
        return getNsKey(materialKey.name());
    }
}
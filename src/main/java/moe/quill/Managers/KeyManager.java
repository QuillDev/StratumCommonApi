package moe.quill.Managers;

import moe.quill.Annotations.IgnoreDynamicLoading;
import moe.quill.Annotations.Keyable;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.Plugin;
import org.reflections.Reflections;

import java.util.HashMap;

@SuppressWarnings("unused")
public class KeyManager {

    private final Reflections reflections;
    private final HashMap<String, NamespacedKey> keys = new HashMap<>();

    public KeyManager(Plugin plugin, String packageString) {

        this.reflections = new Reflections(packageString);
        reflections
                .getTypesAnnotatedWith(Keyable.class)
                .stream()
                .filter(keyClass -> !keyClass.isAnnotationPresent(IgnoreDynamicLoading.class))
                .forEach(keyClass -> {
                    //Get enum keys
                    final var keyObjects = (Enum<?>[]) keyClass.getEnumConstants();

                    //Create keys for all of the keys in this class
                    for (final var key : keyObjects) {
                        keys.putIfAbsent(key.name(), new NamespacedKey(plugin, key.name()));
                    }
                });
    }

    public NamespacedKey getNsKey(String query) {
        return keys.get(query);
    }

    public <E extends Enum<E>> NamespacedKey getNsKey(Enum<E> materialKey) {
        return getNsKey(materialKey.name());
    }
}
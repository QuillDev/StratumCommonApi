package moe.quill.StratumCommonApi.Serialization;

import net.kyori.adventure.text.Component;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public interface ISerializer {

    //Item lists
    byte[] serializeItemList(ArrayList<ItemStack> itemStacks);

    ArrayList<ItemStack> deserializeItemList(byte[] bytes);

    //Longs
    byte[] serializeLong(long value);

    Long deserializeLong(byte[] bytes);

    //Component Lists
    byte[] serializeComponentList(ArrayList<Component> itemStacks);

    ArrayList<Component> deserializeComponentList(byte[] bytes);

    //Strings
    byte[] serializeString(String value);

    String deserializeString(byte[] bytes);

    //Components
    byte[] serializeComponent(Component component);

    Component deserializeComponent(byte[] bytes);

    //Booleans
    byte[] serializeBoolean(Boolean value);

    Boolean deserializeBoolean(byte[] bytes);

    //Item Stacks
    byte[] serializeItemStack(ItemStack itemStack);

    ItemStack deserializeItemStack(byte[] bytes);

    //Floats
    byte[] serializeFloat(float value);

    float deserializeFloat(byte[] bytes);

}

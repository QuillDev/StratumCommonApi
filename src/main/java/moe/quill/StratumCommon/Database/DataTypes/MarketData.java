package moe.quill.StratumCommon.Database.DataTypes;

import org.bukkit.Material;

public class MarketData {

    private final Material material;
    private int buyAmount;
    private int sellAmount;

    public MarketData(Material material, int buyAmount, int sellAmount) {
        this.material = material;
        this.buyAmount = buyAmount;
        this.sellAmount = sellAmount;
    }

    public Material getMaterial() {
        return material;
    }

    public int getSellAmount() {
        return sellAmount;
    }

    public int getBuyAmount() {
        return buyAmount;
    }

    public void setSellAmount(int sellAmount) {
        this.sellAmount = sellAmount;
    }

    public void setBuyAmount(int buyAmount) {
        this.buyAmount = buyAmount;
    }
}

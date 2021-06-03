package moe.quill.StratumCommon.Database;

import moe.quill.StratumCommon.Database.DataTypes.MarketData;
import org.bukkit.Material;

import java.util.Collection;

public interface IDatabaseService {

    /**
     * Get
     *
     * @param queryMat the material to get data for
     * @return the material
     */
    MarketData getMarketData(Material queryMat);

    /**
     * Save a single instance of market data
     *
     * @param marketData to save
     */
    void saveMarketData(MarketData marketData);

    /**
     * Save a list of market data items
     *
     * @param marketDataList to save
     */
    void saveMarketData(Collection<MarketData> marketDataList);

    /**
     * Create a new piece of market data
     *
     * @param marketData to create new data for
     */
    void createMarketData(MarketData marketData);

    /**
     * Forces a sql database connection if one does not exist
     */
    void connect();
}

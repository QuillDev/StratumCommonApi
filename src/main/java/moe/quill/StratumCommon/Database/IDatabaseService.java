package moe.quill.StratumCommon.Database;

import moe.quill.StratumCommon.Database.DataTypes.MarketData;
import moe.quill.StratumCommon.Database.DataTypes.RPGPlayer;
import org.bukkit.Material;

import java.util.Collection;
import java.util.UUID;

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
     * Get
     *
     * @param uuid of the player to get
     * @return the player
     */
    RPGPlayer getPlayer(UUID uuid);

    /**
     * Save a single instance of market data
     *
     * @param player to save
     */
    void savePlayer(RPGPlayer player);

    /**
     * Save a list of market data items
     *
     * @param playerList to save
     */
    void savePlayer(Collection<RPGPlayer> playerList);

    /**
     * Create a new piece of market data
     *
     * @param uuid to create new data for
     */
    void createPlayer(UUID uuid);

    /**
     * Forces a sql database connection if one does not exist
     */
    void connect();
}

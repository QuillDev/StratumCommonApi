package moe.quill.StratumCommonApi.Database.DataTypes;

import java.util.UUID;

public class RPGPlayer {

    private final UUID uuid;
    private int swordsLevel;
    private int loggingLevel;
    private int miningLevel;
    private int archeryLevel;
    private int fishingLevel;
    private int foragingLevel;

    private float swordsExperience;
    private float loggingExperience;
    private float miningExperience;
    private float archeryExperience;
    private float fishingExperience;
    private float foragingExperience;

    public RPGPlayer(
            UUID uuid,
            int swordsLevel,
            int loggingLevel,
            int miningLevel,
            int foragingLevel,
            int archeryLevel,
            int fishingLevel,
            float swordsExperience,
            float loggingExperience,
            float miningExperience,
            float archeryExperience,
            float fishingExperience,
            float foragingExperience
    ) {
        this.uuid = uuid;
        this.swordsLevel = swordsLevel;
        this.loggingLevel = loggingLevel;
        this.miningLevel = miningLevel;
        this.foragingLevel = foragingLevel;
        this.archeryLevel = archeryLevel;
        this.fishingLevel = fishingLevel;
        this.swordsExperience = swordsExperience;
        this.loggingExperience = loggingExperience;
        this.miningExperience = miningExperience;
        this.foragingExperience = foragingExperience;
        this.archeryExperience = archeryExperience;
        this.fishingExperience = fishingExperience;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getArcheryLevel() {
        return archeryLevel;
    }

    public int getFishingLevel() {
        return fishingLevel;
    }

    public int getMiningLevel() {
        return miningLevel;
    }

    public int getLoggingLevel() {
        return loggingLevel;
    }

    public int getSwordsLevel() {
        return swordsLevel;
    }

    public int getForagingLevel() {
        return foragingLevel;
    }

    /**
     * EXPERIENCE GETTERS
     */


    public float getArcheryExperience() {
        return archeryExperience;
    }

    public float getFishingExperience() {
        return fishingExperience;
    }

    public float getMiningExperience() {
        return miningExperience;
    }

    public float getLoggingExperience() {
        return loggingExperience;
    }

    public float getSwordsExperience() {
        return swordsExperience;
    }

    public float getForagingExperience() {
        return foragingExperience;
    }


    /**
     * LEVEL SETTERS
     */

    public void setLoggingLevel(int loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public void setFishingLevel(int fishingLevel) {
        this.fishingLevel = fishingLevel;
    }

    public void setMiningLevel(int miningLevel) {
        this.miningLevel = miningLevel;
    }

    public void setArcheryLevel(int archeryLevel) {
        this.archeryLevel = archeryLevel;
    }


    public void setForagingLevel(int foragingLevel) {
        this.foragingLevel = foragingLevel;
    }


    public void setSwordsLevel(int swordsLevel) {
        this.swordsLevel = swordsLevel;
    }

    /**
     * EXPERIENCE SETTERS
     */

    public void setLoggingExperience(float loggingExperience) {
        this.loggingExperience = loggingExperience;
    }

    public void setMiningExperience(float miningExperience) {
        this.miningExperience = miningExperience;
    }

    public void setSwordsExperience(float swordsExperience) {
        this.swordsExperience = swordsExperience;
    }

    public void setFishingExperience(float fishingExperience) {
        this.fishingExperience = fishingExperience;
    }

    public void setForagingExperience(float foragingExperience) {
        this.foragingExperience = foragingExperience;
    }

    public void setArcheryExperience(float archeryExperience) {
        this.archeryExperience = archeryExperience;
    }
    
}

package moe.quill.StratumCommon.Plugin;

public class StratumConfigBuilder {

    private boolean useDatabase;
    private boolean useKeyManager;
    private boolean useSerialization;

    public StratumConfigBuilder setUseDatabase(boolean useDatabase) {
        this.useDatabase = useDatabase;
        return this;
    }

    public StratumConfigBuilder setUseKeyManager(boolean useKeyManager) {
        this.useKeyManager = useKeyManager;
        return this;
    }

    public StratumConfigBuilder setUseSerialization(boolean useSerialization) {
        this.useSerialization = useSerialization;
        return this;
    }

    public StratumConfig build() {
        return new StratumConfig(useDatabase, useKeyManager, useSerialization);
    }
}

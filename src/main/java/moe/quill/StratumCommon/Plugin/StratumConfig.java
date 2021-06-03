package moe.quill.StratumCommon.Plugin;

public class StratumConfig {

    private final boolean useDatabase;
    private final boolean useKeyManager;
    private final boolean useSerialization;

    public StratumConfig(boolean useDatabase, boolean useKeyManager, boolean useSerialization) {
        this.useDatabase = useDatabase;
        this.useKeyManager = useKeyManager;
        this.useSerialization = useSerialization;
    }

    public boolean isUseDatabase() {
        return useDatabase;
    }

    public boolean isUseKeyManager() {
        return useKeyManager;
    }

    public boolean isUseSerialization() {
        return useSerialization;
    }
}

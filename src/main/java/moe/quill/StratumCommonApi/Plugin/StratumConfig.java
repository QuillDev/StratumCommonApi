package moe.quill.StratumCommonApi.Plugin;

public record StratumConfig(boolean useDatabase, boolean useKeyManager, boolean useSerialization) {

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

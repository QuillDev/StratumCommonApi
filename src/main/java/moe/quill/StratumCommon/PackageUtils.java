package moe.quill.StratumCommon;

import java.util.Arrays;

public class PackageUtils {

    public static String getCutPackageFromClass(Class<?> c) {
        final var fullPackageName = c.getPackageName().split("\\.");
        return String.join(".", Arrays.copyOfRange(fullPackageName, 0, fullPackageName.length - 1));
    }
}

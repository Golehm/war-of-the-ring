package figures.armies.shadow.isengard;

import figures.Figure;
import figures.armies.Regular;

public class IsengardRegular implements Regular {

    private static String name = "Isengard Regular";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        IsengardRegular.name = name;
    }
}

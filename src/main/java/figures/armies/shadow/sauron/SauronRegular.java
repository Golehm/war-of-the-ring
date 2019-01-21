package figures.armies.shadow.sauron;

import figures.Figure;
import figures.armies.Regular;

public class SauronRegular implements Regular {

    private static String name = "Sauron Regular";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SauronRegular.name = name;
    }
}

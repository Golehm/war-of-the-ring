package figures.armies.freepeople.dwarves;

import figures.Figure;
import figures.armies.Regular;

public class DwarvenRegular implements Regular {

    private static String name = "Dwarven Regular";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DwarvenRegular.name = name;
    }

}

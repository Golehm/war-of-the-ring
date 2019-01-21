package figures.armies.freepeople.rohan;

import figures.Figure;
import figures.armies.Regular;

public class RohanRegular implements Regular {

    private static String name = "Rohan Regular";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        RohanRegular.name = name;
    }
}

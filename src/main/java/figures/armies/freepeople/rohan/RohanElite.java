package figures.armies.freepeople.rohan;

import figures.Figure;
import figures.armies.Elite;

public class RohanElite implements Elite {

    private static String name = "Rohan Elite";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        RohanElite.name = name;
    }
}

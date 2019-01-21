package figures.armies.freepeople.dwarves;

import figures.Figure;
import figures.armies.Elite;

public class DwarvenElite implements Elite {

    private static String name = "Dwarven Elite";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DwarvenElite.name = name;
    }

}

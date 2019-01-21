package figures.armies.shadow.sauron;

import figures.Figure;
import figures.armies.Elite;

public class SuronElite implements Elite {

    private static String name = "Sauron Elite";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SuronElite.name = name;
    }
}

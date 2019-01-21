package figures.armies.freepeople.gondor;

import figures.Figure;
import figures.armies.Elite;

public class GondorElite implements Elite {

    private static String name = "Gondor Elite";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GondorElite.name = name;
    }

}

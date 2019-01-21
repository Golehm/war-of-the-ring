package figures.armies.shadow.isengard;

import figures.Figure;
import figures.armies.Elite;

public class IsengardElite implements Elite {

    private static String name = "Isengard Elite";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        IsengardElite.name = name;
    }
}

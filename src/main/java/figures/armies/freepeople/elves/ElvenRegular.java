package figures.armies.freepeople.elves;

import figures.Figure;
import figures.armies.Regular;

public class ElvenRegular implements Regular {

    private static String name = "Elven Regular";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ElvenRegular.name = name;
    }

}

package figures.armies.freepeople.gondor;

import figures.Figure;
import figures.armies.Regular;

public class GondorRegular implements Regular {

    private static String name = "Gondor Regular";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GondorRegular.name = name;
    }

}

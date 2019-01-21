package figures.armies.freepeople.gondor;

import figures.Figure;
import figures.armies.Leader;

public class GondorLeader implements Leader {

    private static String name = "Gondor Leader";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GondorLeader.name = name;
    }

}

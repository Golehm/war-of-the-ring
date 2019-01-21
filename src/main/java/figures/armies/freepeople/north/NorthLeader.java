package figures.armies.freepeople.north;

import figures.Figure;
import figures.armies.Leader;

public class NorthLeader implements Leader {

    private static String name = "North Leader";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        NorthLeader.name = name;
    }
}

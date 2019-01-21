package figures.armies.freepeople.rohan;

import figures.Figure;
import figures.armies.Leader;

public class RohanLeader implements Leader {

    private static String name = "Rohan Leader";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        RohanLeader.name = name;
    }
}

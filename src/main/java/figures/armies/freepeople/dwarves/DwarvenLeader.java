package figures.armies.freepeople.dwarves;

import figures.Figure;
import figures.armies.Leader;

public class DwarvenLeader implements Leader {

    private static String name = "Dwarven Leader";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DwarvenLeader.name = name;
    }

}

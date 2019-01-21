package figures.armies.freepeople.elves;

import figures.Figure;
import figures.armies.Leader;

public class ElvenLeader extends Figure implements Leader {
    private static String name = "Elven Leader";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ElvenLeader.name = name;
    }

    @Override
    public String toString() {
        return "ElvenLeader{" +
                "currentRegion=" + currentRegion +
                '}';
    }
}

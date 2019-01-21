package figures.armies.freepeople.elves;

import figures.Figure;
import figures.armies.Elite;

public class ElvenElite extends Figure implements Elite {

    private static String name = "Elven Elite";

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ElvenElite.name = name;
    }

    @Override
    public String toString() {
        return "ElvenElite{" +
                "currentRegion=" + currentRegion +
                '}';
    }
}

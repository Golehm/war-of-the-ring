package figures.armies;

import map.Region;

import java.util.List;

public abstract class Army {
    private Region region;
    private List<Elite> elites;
    private List<Regular> regulars;
}

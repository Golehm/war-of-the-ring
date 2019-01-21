package map;

import enums.Nation;
import enums.Settlement;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private Settlement settlement = Settlement.NOTHING;
    private Nation nation = Nation.NONE;
    private List<Region> neighbourRegions = new ArrayList<Region>();

    public Region(String name) {
        this.name = name;
    }

    public List<Region> getNeighbourRegions() {
        return neighbourRegions;
    }

    public String getName() {

        return name;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    //@Override
    //public boolean equals(Object obj) {
    //    return super.equals(obj);
    //}
}

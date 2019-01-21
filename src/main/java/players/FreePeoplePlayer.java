package players;

import figures.armies.Elite;
import figures.armies.Leader;
import figures.armies.Regular;
import figures.armies.freepeople.dwarves.DwarvenElite;
import figures.armies.freepeople.dwarves.DwarvenLeader;
import figures.armies.freepeople.dwarves.DwarvenRegular;
import figures.armies.freepeople.elves.ElvenElite;
import figures.armies.freepeople.elves.ElvenLeader;
import figures.armies.freepeople.elves.ElvenRegular;
import figures.armies.freepeople.gondor.GondorElite;
import figures.armies.freepeople.gondor.GondorLeader;
import figures.armies.freepeople.gondor.GondorRegular;
import figures.armies.freepeople.north.NorthElite;
import figures.armies.freepeople.north.NorthLeader;
import figures.armies.freepeople.north.NorthRegular;
import figures.armies.freepeople.rohan.RohanElite;
import figures.armies.freepeople.rohan.RohanLeader;
import figures.armies.freepeople.rohan.RohanRegular;
import map.Region;

import java.util.ArrayList;
import java.util.List;

public class FreePeoplePlayer extends Player {

    private static final int DWARVES_REGULARS = 5;
    private static final int DWARVES_ELITES = 5;
    private static final int DWARVES_LEADERS = 4;

    private static final int ELVES_REGULARS = 5;
    private static final int ELVES_ELITES = 10;
    private static final int ELVES_LEADERS = 4;

    private static final int GONDOR_REGULARS = 15;
    private static final int GONDOR_ELITES = 5;
    private static final int GONDOR_LEADERS = 4;

    private static final int NORTH_REGULARS = 10;
    private static final int NORTH_ELITES = 5;
    private static final int NORTH_LEADERS = 4;

    private static final int ROHAN_REGULARS = 10;
    private static final int ROHAN_ELITES = 5;
    private static final int ROHAN_LEADERS = 4;

    private List<Elite> dwarvesEliteReinforcements = new ArrayList<>();
    private List<Regular> dwarvesRegularReinforcements = new ArrayList<>();
    private List<Leader> dwarvesLeaderReinforcements = new ArrayList<>();

    private List<Elite> elvesEliteReinforcements = new ArrayList<>();
    private List<Regular> elvesRegularReinforcements = new ArrayList<>();
    private List<Leader> elvesLeaderReinforcements = new ArrayList<>();

    private List<Elite> gondorEliteReinforcements = new ArrayList<>();
    private List<Regular> gondorRegularReinforcements = new ArrayList<>();
    private List<Leader> gondorLeaderReinforcements = new ArrayList<>();

    private List<Elite> northEliteReinforcements = new ArrayList<>();
    private List<Regular> northRegularReinforcements = new ArrayList<>();
    private List<Leader> northLeaderReinforcements = new ArrayList<>();

    private List<Elite> rohanEliteReinforcements = new ArrayList<>();
    private List<Regular> rohanRegularReinforcements = new ArrayList<>();
    private List<Leader> rohanLeaderReinforcements = new ArrayList<>();

    void init() {

        for (int i = 0; i < DWARVES_REGULARS; i++) {
            dwarvesRegularReinforcements.add(new DwarvenRegular());
        }
        for(int i=0; i < DWARVES_ELITES; i++){
            dwarvesEliteReinforcements.add(new DwarvenElite());
        }
        for(int i=0; i < DWARVES_LEADERS; i++){
            dwarvesLeaderReinforcements.add(new DwarvenLeader());
        }

        for (int i = 0; i < ELVES_REGULARS; i++) {
            elvesRegularReinforcements.add(new ElvenRegular());
        }
        for(int i=0; i < ELVES_ELITES; i++){
            elvesEliteReinforcements.add(new ElvenElite());
        }
        for(int i=0; i < ELVES_LEADERS; i++){
            elvesLeaderReinforcements.add(new ElvenLeader());
        }

        for (int i = 0; i < GONDOR_REGULARS; i++) {
            gondorRegularReinforcements.add(new GondorRegular());
        }
        for(int i=0; i < GONDOR_ELITES; i++){
            gondorEliteReinforcements.add(new GondorElite());
        }
        for(int i=0; i < GONDOR_LEADERS; i++){
            gondorLeaderReinforcements.add(new GondorLeader());
        }

        for (int i = 0; i < NORTH_REGULARS; i++) {
            northRegularReinforcements.add(new NorthRegular());
        }
        for(int i=0; i < NORTH_ELITES; i++){
            northEliteReinforcements.add(new NorthElite());
        }
        for(int i=0; i < NORTH_LEADERS; i++){
            northLeaderReinforcements.add(new NorthLeader());
        }

        for (int i = 0; i < ROHAN_REGULARS; i++) {
            rohanRegularReinforcements.add(new RohanRegular());
        }
        for(int i=0; i < ROHAN_ELITES; i++){
            rohanEliteReinforcements.add(new RohanElite());
        }
        for(int i=0; i < ROHAN_LEADERS; i++){
            rohanLeaderReinforcements.add(new RohanLeader());
        }
    }

    public static int getDwarvesRegulars() {
        return DWARVES_REGULARS;
    }

    public List<Elite> getDwarvesEliteReinforcements() {
        return dwarvesEliteReinforcements;
    }

    public void setDwarvesEliteReinforcements(List<Elite> dwarvesEliteReinforcements) {
        this.dwarvesEliteReinforcements = dwarvesEliteReinforcements;
    }

    public List<Regular> getDwarvesRegularReinforcements() {
        return dwarvesRegularReinforcements;
    }

    public void setDwarvesRegularReinforcements(List<Regular> dwarvesRegularReinforcements) {
        this.dwarvesRegularReinforcements = dwarvesRegularReinforcements;
    }

    public List<Leader> getDwarvesLeaderReinforcements() {
        return dwarvesLeaderReinforcements;
    }

    public void setDwarvesLeaderReinforcements(List<Leader> dwarvesLeaderReinforcements) {
        this.dwarvesLeaderReinforcements = dwarvesLeaderReinforcements;
    }

    public List<Elite> getElvesEliteReinforcements() {
        return elvesEliteReinforcements;
    }

    public void setElvesEliteReinforcements(List<Elite> elvesEliteReinforcements) {
        this.elvesEliteReinforcements = elvesEliteReinforcements;
    }

    public List<Regular> getElvesRegularReinforcements() {
        return elvesRegularReinforcements;
    }

    public void setElvesRegularReinforcements(List<Regular> elvesRegularReinforcements) {
        this.elvesRegularReinforcements = elvesRegularReinforcements;
    }

    public List<Leader> getElvesLeaderReinforcements() {
        return elvesLeaderReinforcements;
    }

    public void setElvesLeaderReinforcements(List<Leader> elvesLeaderReinforcements) {
        this.elvesLeaderReinforcements = elvesLeaderReinforcements;
    }

    public List<Elite> getGondorEliteReinforcements() {
        return gondorEliteReinforcements;
    }

    public void setGondorEliteReinforcements(List<Elite> gondorEliteReinforcements) {
        this.gondorEliteReinforcements = gondorEliteReinforcements;
    }

    public List<Regular> getGondorRegularReinforcements() {
        return gondorRegularReinforcements;
    }

    public void setGondorRegularReinforcements(List<Regular> gondorRegularReinforcements) {
        this.gondorRegularReinforcements = gondorRegularReinforcements;
    }

    public List<Leader> getGondorLeaderReinforcements() {
        return gondorLeaderReinforcements;
    }

    public void setGondorLeaderReinforcements(List<Leader> gondorLeaderReinforcements) {
        this.gondorLeaderReinforcements = gondorLeaderReinforcements;
    }

    public List<Elite> getNorthEliteReinforcements() {
        return northEliteReinforcements;
    }

    public void setNorthEliteReinforcements(List<Elite> northEliteReinforcements) {
        this.northEliteReinforcements = northEliteReinforcements;
    }

    public List<Regular> getNorthRegularReinforcements() {
        return northRegularReinforcements;
    }

    public void setNorthRegularReinforcements(List<Regular> northRegularReinforcements) {
        this.northRegularReinforcements = northRegularReinforcements;
    }

    public List<Leader> getNorthLeaderReinforcements() {
        return northLeaderReinforcements;
    }

    public void setNorthLeaderReinforcements(List<Leader> northLeaderReinforcements) {
        this.northLeaderReinforcements = northLeaderReinforcements;
    }

    public List<Elite> getRohanEliteReinforcements() {
        return rohanEliteReinforcements;
    }

    public void setRohanEliteReinforcements(List<Elite> rohanEliteReinforcements) {
        this.rohanEliteReinforcements = rohanEliteReinforcements;
    }

    public List<Regular> getRohanRegularReinforcements() {
        return rohanRegularReinforcements;
    }

    public void setRohanRegularReinforcements(List<Regular> rohanRegularReinforcements) {
        this.rohanRegularReinforcements = rohanRegularReinforcements;
    }

    public List<Leader> getRohanLeaderReinforcements() {
        return rohanLeaderReinforcements;
    }

    public void setRohanLeaderReinforcements(List<Leader> rohanLeaderReinforcements) {
        this.rohanLeaderReinforcements = rohanLeaderReinforcements;
    }

    void moveFellowship(Region destination) {

    }
}

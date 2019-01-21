package enums;

public enum Settlement {
    STRONGHOLD(2),
    CITY(1),
    TOWN(0),
    FORTIFICATION(0),
    NOTHING(0);

    private int victoryPoints;

    Settlement(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }
}

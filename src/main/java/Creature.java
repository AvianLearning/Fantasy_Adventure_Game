public class Creature {

    private String creatureType;
    private int healthPoints;

    public Creature(String creatureType, int healthPoints) {
        this.creatureType = creatureType;
        this.healthPoints = healthPoints;
    }

    public String getCreatureType() {
        return creatureType;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

}

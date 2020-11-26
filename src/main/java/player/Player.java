package player;

import creature.Creature;
import treasure.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthPoints;
    private ArrayList<Treasure> treasuresInBag;
    private ArrayList<Creature> enemiesDefeated;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.treasuresInBag = new ArrayList<>();
        this.enemiesDefeated = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public ArrayList<Treasure> getTreasuresInBag() {
        return treasuresInBag;
    }

    public ArrayList<Creature> getEnemiesDefeated() {
        return enemiesDefeated;
    }


}

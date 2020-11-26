package rooms;

import creature.Creature;
import treasure.Treasure;

import java.util.ArrayList;

public abstract class Room {

    private String name;
    private ArrayList<Treasure>treasureHoard;
    private ArrayList<Creature>enemies;

    public Room(String name) {
        this.name = name;
        this.treasureHoard = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Treasure> getTreasureHoard() {
        return treasureHoard;
    }

    public ArrayList<Creature> getEnemies() {
        return enemies;
    }

    public int countTreasure(){
        return this.treasureHoard.size();
    }

    public void addTreasure(Treasure treasure){
        this.treasureHoard.add(treasure);
    }



}

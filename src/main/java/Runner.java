import components.Weapon;
import creature.Creature;
import magicians.Wizard;
import rooms.Dungeon;
import treasure.Treasure;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dungeon dungeon = new Dungeon("Deep dark dungeon");
        Creature ogre = new Creature("Ogre", 50);
        Weapon spell = new Weapon("Fireball", 10);
        Wizard jenken = new Wizard("Jenken", 100, "Stick", ogre, spell);

        System.out.println("Welcome to DnD!");
        System.out.println("You are a wizard called: " + jenken.getName());
        System.out.println("You are in a room called: " + dungeon.getName());

        dungeon.addTreasure(Treasure.DIAMONDS);
        dungeon.addCreature(ogre);

        System.out.println("You are faced with a " + dungeon.getEnemies().get(0).getCreatureType() + " with " + ogre.getHealthPoints() + " health points");
        System.out.println("You attack with: " + jenken.getSpell().getType());

        while (dungeon.getEnemies().get(0).getHealthPoints() > 0){
            jenken.attack(spell, ogre);
            System.out.println("Ogre health is " + dungeon.getEnemies().get(0).getHealthPoints());
            System.out.println("You attack with: " + jenken.getSpell().getType());
        }

        System.out.println("You killed the enemy!");
        System.out.println("There are " + dungeon.getTreasureHoard().get(0) + " in the room.");
        System.out.println("You collect the treasure in the room");

        jenken.collectTreasure(dungeon.getTreasureHoard().get(0), dungeon);
        System.out.println("You have " + jenken.getTreasuresInBag().get(0) + " in your bag.");

        int total = 0;
        for (Treasure treasure: jenken.getTreasuresInBag()){
            total += treasure.getValue();
        }

        System.out.println("The total value of treasure in your bag is " + total);
    }
}

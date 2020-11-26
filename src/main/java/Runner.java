import components.Weapon;
import creature.Creature;
import magicians.Wizard;
import rooms.Dungeon;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dungeon dungeon = new Dungeon("Deep dark dungeon");
        Creature orge = new Creature("orge", 50);
        Weapon spell = new Weapon("Fireball", 10);
        Wizard jenken = new Wizard("Jenken", 100, "Stick", orge, spell);

    }


}

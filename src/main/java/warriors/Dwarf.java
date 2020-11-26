package warriors;

import Player;
import components.Weapon;

public class Dwarf extends Player {

    protected Weapon weaponInHand;

    public Dwarf(String name, int healthPoints, Weapon weaponInHand) {
        super(name, healthPoints);
        this.weaponInHand = weaponInHand;
    }
}

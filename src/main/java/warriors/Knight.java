package warriors;

import components.Weapon;
import player.Player;

public class Knight extends Player {

    private int armour;
    protected Weapon weaponInHand;

    public Knight(String name, int healthPoints, Weapon weaponInHand, int armour) {
        super(name, healthPoints);
        this.weaponInHand = weaponInHand;
        this.armour = armour;
    }

    public Weapon getWeaponInHand() {
        return weaponInHand;
    }

    public int getArmour() {
        return armour;
    }
}

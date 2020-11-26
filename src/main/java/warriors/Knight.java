package warriors;

import Player;
import components.Weapon;

public class Knight extends Player {

    protected Weapon weaponInHand;
    private String helmet;

    public Knight(String name, int healthPoints, Weapon weaponInHand, String helmet) {
        super(name, healthPoints);
        this.weaponInHand = weaponInHand;
        this.helmet = helmet;
    }

    public Weapon getWeaponInHand() {
        return weaponInHand;
    }

    public String getHelmet() {
        return helmet;
    }
}

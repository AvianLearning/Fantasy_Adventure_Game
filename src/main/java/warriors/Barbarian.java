package warriors;

import components.Weapon;
import player.Player;

public class Barbarian extends Player {

    private String shaggyCoat;
    protected Weapon weaponInHand;

    public Barbarian(String name, int healthPoints, Weapon weaponInHand, String shaggyCoat) {
        super(name, healthPoints);
        this.weaponInHand = weaponInHand;
        this.shaggyCoat = shaggyCoat;
    }

    public String getShaggyCoat() {
        return shaggyCoat;
    }

    public Weapon getWeaponInHand() {
        return weaponInHand;
    }
}

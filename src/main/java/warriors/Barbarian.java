package warriors;

import behaviours.IAttack;
import components.Weapon;
import creature.Creature;
import player.Player;

public class Barbarian extends Player implements IAttack {

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

    @Override
    public void attack(Weapon weapon, Creature creature) {
        int healthRemaining = creature.getHealthPoints() - weapon.getDamage();
        creature.setHealthPoints(healthRemaining);
    }
}

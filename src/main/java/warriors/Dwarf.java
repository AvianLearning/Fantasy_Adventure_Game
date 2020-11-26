package warriors;

import behaviours.IAttack;
import creature.Creature;
import player.Player;
import components.Weapon;

public class Dwarf extends Player implements IAttack {

    protected Weapon weaponInHand;

    public Dwarf(String name, int healthPoints, Weapon weaponInHand) {
        super(name, healthPoints);
        this.weaponInHand = weaponInHand;
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

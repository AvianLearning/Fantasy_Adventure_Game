package warriors;

import behaviours.IAttack;
import components.Weapon;
import creature.Creature;
import player.Player;

public class Knight extends Player implements IAttack {

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

    @Override
    public void attack(Weapon weapon, Creature creature) {
        int healthRemaining = creature.getHealthPoints() - weapon.getDamage();
        creature.setHealthPoints(healthRemaining);
    }
}

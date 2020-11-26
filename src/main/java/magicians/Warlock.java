package magicians;

import behaviours.IAttack;
import components.Weapon;
import creature.Creature;
import player.Player;

public class Warlock extends Player implements IAttack {

    private Creature mythicalCreature;
    private Weapon spell;

    public Warlock(String name, int healthPoints, Creature mythicalCreature, Weapon spell) {
        super(name, healthPoints);
        this.mythicalCreature = mythicalCreature;
        this.spell = spell;
    }

    public Creature getMythicalCreature() {
        return mythicalCreature;
    }

    public Weapon getSpell() {
        return spell;
    }

    @Override
    public void attack(Weapon weapon, Creature creature) {
        int healthRemaining = creature.getHealthPoints() - weapon.getDamage();
        creature.setHealthPoints(healthRemaining);
    }
}

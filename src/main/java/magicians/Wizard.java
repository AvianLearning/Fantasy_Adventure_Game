package magicians;

import behaviours.IAttack;
import components.Weapon;
import creature.Creature;
import player.Player;

public class Wizard extends Player implements IAttack {

    private String wandName;
    private Creature mythicalCreature;
    private Weapon spell;

    public Wizard(String name, int healthPoints, String wandName, Creature mythicalCreature, Weapon spell) {
        super(name, healthPoints);
        this.wandName = wandName;
        this.mythicalCreature = mythicalCreature;
        this.spell = spell;
    }

    public String getWand() {
        return wandName;
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

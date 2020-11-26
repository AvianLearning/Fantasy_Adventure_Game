package magicians;

import components.Weapon;
import creature.Creature;
import player.Player;

public class Warlock extends Player {

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
}

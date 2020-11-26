package magicians;

import components.Weapon;
import creature.Creature;
import player.Player;

public class Wizard extends Player {

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
}

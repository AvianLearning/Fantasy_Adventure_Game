package behaviours;

import components.Weapon;
import creature.Creature;

public interface IAttack {
    public void attack(Weapon weapon, Creature creature);
}

import components.Weapon;
import creature.Creature;
import magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class WizardTest {

    Wizard wizard;
    Creature creature;
    Weapon spell;

    @Before
    public void setUp () {
        creature = new Creature("Bat", 20);
        spell = new Weapon("Fireball", 25);
        wizard = new Wizard("Merlin", 150, "Phoenix Feather", creature, spell);
    }

    @Test
    public void hasWand() {
        assertEquals("Phoenix Feather", wizard.getWand());
    }

    @Test
    public void hasCreature() {
        assertEquals("Bat", wizard.getMythicalCreature().getCreatureType());
    }

    @Test
    public void hasSpell() {
        assertEquals(25, wizard.getSpell().getDamage());
    }
}

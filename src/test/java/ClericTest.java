import components.Medicine;
import components.Weapon;
import healers.Cleric;
import org.junit.Before;
import org.junit.Test;
import warriors.Dwarf;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Medicine healingTool;
    Dwarf dwarf;
    Weapon weapon;

    @Before
    public void setUp() {
        weapon = new Weapon("Axe", 20);
        healingTool = new Medicine("Elixir of Health", 15);
        cleric = new Cleric("Colin", 50, healingTool);
    }

    @Test
    public void clericHasHealingTool() {
        assertEquals("Elixir of Health", cleric.getHealingTool().getPotionName());
    }

    @Test
    public void canHealPlayer() {
        dwarf = new Dwarf("Grumpy", 100, weapon);
        cleric.heal(dwarf);
        assertEquals(115, dwarf.getHealthPoints());
    }
}

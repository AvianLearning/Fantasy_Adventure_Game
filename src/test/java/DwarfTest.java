import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import warriors.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Weapon weaponInHand;

    @Before
    public void setUp(){
        weaponInHand = new Weapon("Axe", 10);
        dwarf = new Dwarf("Shorty", 100, weaponInHand);
    }

    @Test
    public void hasName(){
        assertEquals("Shorty", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void hasWeaponInHand(){
        assertEquals("Axe", dwarf.getWeaponInHand().getType());
    }
}

import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import warriors.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Weapon weaponInHand;


    @Before
    public void setUp(){
        weaponInHand = new Weapon("Spiky club", 10);
        barbarian = new Barbarian("Red Sonia", 100, weaponInHand, "Shaggy coat");
    }

    @Test
    public void hasName(){
        assertEquals("Red Sonia", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeaponInHand(){
        assertEquals("Spiky club", barbarian.getWeaponInHand().getType());
    }

    @Test
    public void hasShaggyCoat(){
        assertEquals("Shaggy coat", barbarian.getShaggyCoat());
    }
}

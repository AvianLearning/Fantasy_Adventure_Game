import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import warriors.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon weaponInHand;

    @Before
    public void setUp(){
        weaponInHand = new Weapon("Sword", 10);
        knight = new Knight("Knighty", 100, weaponInHand, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Knighty", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasWeaponInHand(){
        assertEquals("Sword", knight.getWeaponInHand().getType());
    }

    @Test
    public void hasArmour(){
        assertEquals(20, knight.getArmour());
    }
}

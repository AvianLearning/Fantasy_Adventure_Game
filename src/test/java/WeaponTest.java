import components.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void setUp(){
        weapon = new Weapon("Axe", 10);
    }

    @Test
    public void canGetType(){
        assertEquals("Axe", weapon.getType());
    }

    @Test
    public void canGetDamage(){
        assertEquals(10, weapon.getDamage());
    }


}

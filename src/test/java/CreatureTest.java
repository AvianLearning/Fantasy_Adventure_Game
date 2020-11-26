import creature.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature dragon;

    @Before
    public void setUp(){
        dragon = new Creature("Dragon", 120);
    }

    @Test
    public void hasCreatureType(){
        assertEquals("Dragon", dragon.getCreatureType());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(120, dragon.getHealthPoints());
    }
}

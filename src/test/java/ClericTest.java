import components.Medicine;
import healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Medicine healingTool;

    @Before
    public void setUp() {
        healingTool = new Medicine("Elixir of Health", 15);
        cleric = new Cleric("Colin", 50, healingTool);
    }

    @Test
    public void clericHasHealingTool() {
        assertEquals("Elixir of Health", cleric.getHealingTool().getPotionName());
    }
}

import components.Medicine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MedicineTest {

    Medicine medicine;

    @Before
    public void setUp(){
        medicine = new Medicine("Love Potion", 9);
    }

    @Test
    public void canGetPotionName(){
        assertEquals("Love Potion", medicine.getPotionName());
    }

    @Test
    public void canGetHealPoints(){
        assertEquals(9, medicine.getHealPoints());
    }



}

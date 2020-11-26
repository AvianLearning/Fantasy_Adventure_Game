import components.Weapon;
import org.junit.Before;
import org.junit.Test;
import rooms.BanquetingRoom;
import rooms.Dungeon;
import rooms.Room;
import treasure.Treasure;
import warriors.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {
    Barbarian barbarian;
    Weapon weaponInHand;
    BanquetingRoom feastHall;

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

    @Test
    public void canAddTreasureToPlayer() {
        feastHall = new BanquetingRoom("feastHall");
        feastHall.addTreasure(Treasure.DIAMONDS);
        barbarian.collectTreasure(feastHall.getTreasureHoard().get(0), feastHall);
        assertEquals(1, barbarian.getTreasuresInBag().size());
        assertEquals(0, feastHall.getTreasureHoard().size());
        assertEquals(10, barbarian.getTreasuresInBag().get(0).getValue());
    }


}

import creature.Creature;
import org.junit.Before;
import org.junit.Test;
import rooms.Dungeon;
import treasure.Treasure;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Creature creature;

    @Before
    public void setUp(){
        dungeon = new Dungeon("Dark Dungeon of Doom");
        creature = new Creature("Orc", 50);
    }

    @Test
    public void canAddTreasureToRoom(){
    dungeon.addTreasure(Treasure.GOLD);
    assertEquals(1, dungeon.countTreasure());
    }

}

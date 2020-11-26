package healers;

import behaviours.IHeal;
import components.Medicine;
import player.Player;

public class Cleric extends Player implements IHeal {
    private Medicine healingTool;

    public Cleric(String name, int healthPoints, Medicine healingTool) {
        super(name, healthPoints);
        this.healingTool = healingTool;
    }

    public Medicine getHealingTool() {
        return healingTool;
    }


    @Override
    public void heal(Player player) {
        int totalHealth = player.getHealthPoints() + healingTool.getHealPoints();
        player.setHealthPoints(totalHealth);
    }
}

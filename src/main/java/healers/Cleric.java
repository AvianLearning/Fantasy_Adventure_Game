package healers;

import components.Medicine;
import player.Player;

public class Cleric extends Player {
    private Medicine healingTool;

    public Cleric(String name, int healthPoints, Medicine healingTool) {
        super(name, healthPoints);
        this.healingTool = healingTool;
    }

    public Medicine getHealingTool() {
        return healingTool;
    }
}

package warriors;

import Player;

public class Barbarian extends Player {

    private String shaggyCoat;

    public Barbarian(String name, int healthPoints, String shaggyCoat) {
        super(name, healthPoints);
        this.shaggyCoat = shaggyCoat;
    }

    public String getShaggyCoat() {
        return shaggyCoat;
    }
}

package treasure;

public enum Treasure {
    PEARL(2),
    SILVER(3),
    GOLD(5),
    DIAMONDS(10);

    public final int value;

    Treasure(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

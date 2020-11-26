package components;

public class Medicine {

    private String potionName;
    private int healPoints;

    public Medicine(String potionName, int healPoints) {
        this.potionName = potionName;
        this.healPoints = healPoints;
    }

    public String getPotionName() {
        return potionName;
    }

      public int getHealPoints() {
        return healPoints;
    }


}

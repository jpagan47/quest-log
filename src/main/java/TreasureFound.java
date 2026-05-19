public class TreasureFound {
    private String treasureName;
    private String rarity;

    public TreasureFound(String treasureName, String rarity) {
        this.treasureName = treasureName;
        this.rarity = rarity;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }



    public String getName() {
        return this.treasureName;
    }

    public int getPoints() {
        int points = 0;
        if (this.rarity.equalsIgnoreCase("common")) {
            points = 25;
        }
        else if (this.rarity.equalsIgnoreCase("rare")) {
            points = 75;
        }
        else if (this.rarity.equalsIgnoreCase("legendary")) {
            points = 150;
        }
        else {
            points = 0;
        }
        return points;
    }

    public String getSummary(){
        return "Found " + getRarity() + " " + getName() +" " +getPoints();
    }
}

public class TrapTriggered implements ScoreEvent{
    private String trapName;
    private int damage;


    @Override
    public String getName() {
        return this.trapName;
    }

    @Override
    public int getPoints() {
        int points = this.damage * -10;
        return points;
    }

    @Override
    public String getSummary() {
        return "Triggered " + getName() + " for " + getPoints();
    }
}

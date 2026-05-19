public class MonsterDefeat implements ScoreEvent{
    private String monsterName;
    private int difficultyLevel;

    public MonsterDefeat(String monsterName, int difficultyLevel, boolean boss) {
        this.monsterName = monsterName;
        this.difficultyLevel = difficultyLevel;
        this.boss = boss;
    }

    private boolean boss;

    @Override
    public String getName(){
        return this.monsterName;
    }
    @Override
    public int getPoints(){
       int point  = this.difficultyLevel * 50;
       if (boss){
           point += 100;
       }
       return point;
    }
    @Override
    public String getSummary(){
        return "Defeated " + this.monsterName + "for " + getPoints() + " points";
    }


    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }




}

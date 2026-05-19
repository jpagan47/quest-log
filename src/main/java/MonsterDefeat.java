public class MonsterDefeat {
    private String monsterName;
    private int difficultyLevel;
    private boolean boss;


    public String getName(){
        return this.monsterName;
    }
    public int getPoints(){
       int point  = this.difficultyLevel * 50;
       if (boss){
           point += 100;
       }
       return point;
    }
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

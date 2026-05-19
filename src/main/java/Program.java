public class Program {
    public static void main(String[] args) {
        ScoreEvent event1 = new MonsterDefeat("Pat",2, true);
        ScoreEvent event2 = new TreasureFound("Rubies", "legendary");


        System.out.println(event1.getPoints() + event1.getSummary());

    }

}

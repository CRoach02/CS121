package weekTen.ArrayListsAndJumps.StringArrayListActivity;

public class StringArrayListTest {
    public static void main(String[] args) {
        StringArrayList demo = new StringArrayList();

        demo.addScore(90);
        demo.addScore(80);
        demo.addScore(70);

        System.out.println("Scores contains "+demo.getScoreListSize()+" elements.");
        demo.displayScores1();

        System.out.println("Remove first element: "+demo.getScore(0)+"\n");
        demo.removeScore(0);
        System.out.println("Scores contains "+demo.getScoreListSize()+" elements.");
        demo.displayScores2();
    }
}

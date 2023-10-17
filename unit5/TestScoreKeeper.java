public class TestScoreKeeper{
    public static void main(String[] args){
        ScoreKeeper s = new ScoreKeeper();
        System.out.println(s.getScore());
        s.scoreNormal();
        System.out.println(s.getScore());
        s.scoreBonus();
        System.out.println(s.getScore());
    }
    
}
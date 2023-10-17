public class ScoreKeeper{
    private int scoreKeeper =0;
    
    public int getScore(){
        return scoreKeeper;
    }
    
    public void scoreNormal(){
        scoreKeeper +=100;
    }
    
    public void scoreBonus(){
        scoreKeeper +=1000;
    }
}
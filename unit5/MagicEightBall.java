public class MagicEightBall{
    private final String one = "maybe";
    private final String two = "yes";
    private final String three = "absolutely not";
    private final String four = "idk man";
    private final String five = "it depends";
    
    public String ask(String ask){
        int a = (int)(Math.random()*5)+1;
        if (a == 1){
            return one;
        }else if (a ==2){
            return two;
        }else if (a ==3){
            return three;
        }else if (a ==4){
            return four;
        }else if (a ==5){
            return five;
        }else{
            return "ew";
        }
    }
}
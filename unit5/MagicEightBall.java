public class MagicEightBall{
    private final String one = "maybe";
    private final String two = "yes";
    private final String three = "absolutely not";
    private final String four = "idk man";
    private final String five = "it depends";
    
    public String ask(String ask){
        String s = "Q: "+ask+" A: ";
        int a = (int)(Math.random()*5)+1;
        if (a == 1){
            s+=one;
        }else if (a ==2){
            s+=two;
        }else if (a ==3){
            s+= three;
        }else if (a ==4){
            s+= four;
        }else if (a ==5){
            s+= five;
        }else{
            s+= "ew";
        }
        return s;
    }
}
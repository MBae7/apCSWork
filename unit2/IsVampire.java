public class IsVampire
{
    public static boolean isVampire(float hour, boolean awake){
        return(((hour>6&&hour<22)&& !awake)||(hour>22||hour<6)&& awake);
    }
    public static void testIsVampire(float hour, boolean awake, boolean expected){
        boolean result = isVampire(hour, awake);
        
        System.out.println("hour: "+hour+" awake: "+awake+" expected: "+" result: "+result);
        
        if (result == expected){
            System.out.println("Yay!!!");
        }else {
            System.out.println("booooo");
        }
    }
    public static void main(String[] args){
        testIsVampire(6.4f,false,true);
        testIsVampire(4,false,false);
        testIsVampire(7.3f,true,false);
        testIsVampire(23,true,true);
        testIsVampire(23,false,false);
    }
}
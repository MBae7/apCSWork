public class ParrotTrouble
{
    public static boolean parrotTrouble(boolean talking, int hour){
        return (talking && (hour<7 || hour>20));
    }
    
    public static void testParrotTrouble(boolean talking, int hour, boolean expected)
    {
        boolean result = parrotTrouble(talking, hour);
        
        System.out.println("Talking: "+talking+" Hour: "+hour+" Expected: "+expected+" Result: "+result);
        
        if (result == expected){
            System.out.println("yay!");
        }else{
             System.out.println("nooooo!");
        }
    }
    
    public static void main(String[] args){
        testParrotTrouble(true,6,true);
        testParrotTrouble(true, 7,false);
        testParrotTrouble(false, 6, false);
    }
}
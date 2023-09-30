public class HasTeen{
    public static boolean hasTeen(int a, int b, int c){
          return((a<=19 && a>=13) ||(b<=19 && b>=13) || (c<=19 && c>=13));
    }
    public static void testHasTeen(int a, int b, int c, boolean expected){
        boolean result = hasTeen(a,b,c);
        
        System.out.println("age a = "+a+" age b = "+b+" age c = "+c+" result = "+result);
        
        if (expected == result){
            System.out.println("YAYYY");
        }else{
             System.out.println("noooooo");
        }
    }
    public static void main(String[] args){
        testHasTeen(13,20,10,true);
        testHasTeen(23,20,10,false);
        testHasTeen(17,30,2,true);
        testHasTeen(0,19,10,true);
        testHasTeen(100,20,10,false);
    }
}
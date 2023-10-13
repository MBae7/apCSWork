public class Factorial{
    public static long factorial(int a){
            long b =1;
        for(int i=1; i<a+1; i++){
            b*=i;
           // System.out.println(b);
            // System.out.println(i);
        }
        //System.out.println(b);
        return(b);
    }
    
    public static void testFactorial(int a, int expected){
        long result = factorial(a);
        
        System.out.println("original int = "+a+ " expected = "+expected+" result = "+result);
        
        if (result == expected){
            System.out.println("Yay!!!!!!");
        }else{
            System.out.println("BOOOOOOO");
        }
        
    }
    
    public static void main(String[] args){
        testFactorial(0,1);
        testFactorial(1,1);
        testFactorial(2,2);
        testFactorial(3,6);
        testFactorial(4,24);
        testFactorial(5,120);
        testFactorial(10,3628800);
       // testFactorial(18);
    }
}
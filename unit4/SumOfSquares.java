public class SumOfSquares{
    public static int sumOfSquares(int a){
        int x=1;
        for(int i =2; i<a+1;i++){
             x+= i*i;
        }
       
     System.out.println (x);
     return x;
    }
    
    public static void testSumOfSquares(int a, int expected){
        int result = sumOfSquares(a);
        
        System.out.println("original int = "+a+ " expected = "+expected+" result = "+result);
        
        if (result == expected){
            System.out.println("Yay!!!!!!");
        }else{
            System.out.println("BOOOOOOO");
        }
        
    }
    
    public static void main(String[] args){
       testSumOfSquares(1,1);
       testSumOfSquares(2,5);
       testSumOfSquares(3,14);
       testSumOfSquares(4,30);
       testSumOfSquares(5,55);
    }
}
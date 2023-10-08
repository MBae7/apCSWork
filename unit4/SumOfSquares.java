public class SumOfSquares{
    public static int sumOfSquares(int a){
        int x=1;
        for(int i =2; i<a+1;i++){
             x+= i*i;
        }
       
     System.out.println (x);
     return x;
    }
    public static void main(String[] args){
       sumOfSquares(1);
       sumOfSquares(2);
       sumOfSquares(3);
       sumOfSquares(4);
       sumOfSquares(5);
    }
}
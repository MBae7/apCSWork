public class Factorial{
    public static long factorial(int a){
            long b =1;
        for(int i=1; i<a+1; i++){
            b*=i;
            System.out.println(b);
             System.out.println(i);
        }
        System.out.println(b);
        return(b);
    }
    
    public static void main(String[] args){
        factorial(0);
        factorial(1);
        factorial(2);
        factorial(3);
        factorial(4);
        factorial(5);
        factorial(10);
        factorial(18);
    }
}
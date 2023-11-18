import java.util.*;

public class Fibonacci{
    public static int[] fibonacci(int n){
        int[] result = new int[n];
        if (n>0){
            result[0]=1;
            if(n>1){
               result[1]=1; 
            }
        }
        for (int i=2; i<n; i++){
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
    
    public static void main(String[] args){
        for(int x : fibonacci(2)){
            System.out.print(x+", ");
        }
        System.out.println();
        for(int x : fibonacci(3)){
            System.out.print(x+", ");
        }
         System.out.println();
        for(int x : fibonacci(4)){
            System.out.print(x+", ");
        }
         System.out.println();
        for(int x : fibonacci(5)){
            System.out.print(x+", ");
        }
        
    }
}
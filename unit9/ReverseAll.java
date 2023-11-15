 import java.util.*;

public class ReverseAll{
    public static String[] reverseAll(String[] words){
        String[] reverse = new String[words.length];
            
        for (int i=0; i<words.length; i++)
        {
            reverse[i] = reverse(words[i]);
        }
        return reverse;
    }
    
    public static String reverse(String str){
        String x = "";
        for(int i=0; i<str.length();i++){
           String h = str.substring(str.length()-i-1,str.length()-i);
            x+=h;
        }
        
        return x;
    }
    
    public static void main(String[] args){
        String[] words = {"abcd", "xyz"};
        for (String x : reverseAll(words))
            System.out.print(x + " ");
        
         System.out.println();
        
        String[] words2 = {"1234", "5678"};
        for (String x : reverseAll(words2))
            System.out.print(x + " ");
        
         System.out.println();
        
        String[] words3 = {"racecar", "tacocat", "izzi"};
        for (String x : reverseAll(words3))
            System.out.print(x + " ");
    }
}
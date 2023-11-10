import java.util.*;

public class CountZNamesArray{
   public static int countZNamesArray(ArrayList<String> names){
        int total =0;
         for(String x : names){
            String y = x.substring(0,1);
            // System.out.println(y);
            if(y.equals("Z")|| y.equals("z")){
                total += x.length();
            //System.out.println(total);
            }else{
            total = total;
        }
            
      }
         return total;
    }
    
    public static void testCountZNamesArray(ArrayList<String> names, int expected){
        int result = countZNamesArray(names);
        
        System.out.println("result = "+result+" expected = "+expected);
        
        if (result == expected){
           System.out.println("yayyyy");
        } else{
             System.out.println("noooo");
        }
    }
    
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Zia Bae");
        names.add("zookeeper");
        
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Mia Bae");
        names2.add("zookeeper");
        
        testCountZNamesArray(names,16);
        testCountZNamesArray(names2,9);
    }
} 

public class CountZNames{
    public static int countZNames(String[] names){
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
    
    public static void testCountZNames(String[] names, int expected){
        int result = countZNames(names);
        
        System.out.println("result = "+result+" expected = "+expected);
        
        if (result == expected){
           System.out.println("yayyyy");
        } else{
             System.out.println("noooo");
        }
    }
    
    public static void main(String[] args){
        String[] names = {"Zia Bae","zookeeper"};
        testCountZNames(names,16);
        
         String[] names2 = {"Mia Bae","zookeeper"};
        testCountZNames(names2,9);
    }
}
public class CountOccurrences{
    public static int countOccurrences(String a, String b){
        int x = 0;
        for(int i =0; i<a.length()-b.length()+1; i++){
            String sub = a.substring(i,i+b.length());
            if(sub.equals(b)){
                x++;
            }
            // System.out.println(sub);
        }
      
        System.out.println("String a: "+a+" String b: "+b+" Count: "+x);
         return x;
    }
    
     public static void testCountOccurrences(String a, String b, int expected){
        int result = countOccurrences(a,b);
        
       System.out.println("String a: "+a+" String b: "+b+"expected = "+expected+" Count: "+result);
        
        if (result == expected){
            System.out.println("Yay!!!!!!");
        }else{
            System.out.println("BOOOOOOO");
        }
        
    }
    
    public static void main(String[] args){
        testCountOccurrences("Mississippi", "iss", 2);
        testCountOccurrences("banananana", "na", 4);
        testCountOccurrences("Polar Bear", "ar", 2);
        testCountOccurrences("miabae", "a", 2);
        testCountOccurrences("miabae", "ello", 0);
    }
}
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
    
    public static void main(String[] args){
        countOccurrences("Mississippi", "iss");
        countOccurrences("banananana", "na");
        countOccurrences("Polar Bear", "ar");
        countOccurrences("miabae", "a");
        countOccurrences("miabae", "ello");
    }
}
public class Reverse{
    public static String reverse(String str){
        String x = "";
        for(int i=0; i<str.length();i++){
           String h = str.substring(str.length()-i-1,str.length()-i);
            x+=h;
        }
     
        return x;
    }
    
    public static void testReverse(String str, String expected){
        String result = reverse(str);
        
         System.out.println("String = "+str+ " expected = "+expected+" result = "+result);
        
        if (result.equals(expected)){
            System.out.println("Yay!!!!!!");
        }else{
            System.out.println("BOOOOOOO");
        }
}
    
    public static void main(String args[]){
        testReverse("happy", "yppah");
        testReverse("potato", "otatop");
        testReverse("tacocat", "tacocat");
        testReverse("Hello, world!", "!dlrow ,olleH");
        testReverse("I am a frog", "gorf a ma I");
        testReverse("Jessica", "acisseJ");
        testReverse("cara huang", "gnauh arac");
    }
    
}
public class Reverse{
    public static String reverse(String str){
        String x = "";
        for(int i=0; i<str.length();i++){
           String h = str.substring(str.length()-i-1,str.length()-i);
            x+=h;
        }
        System.out.println(x);
        return x;
    }
    
    public static void main(String args[]){
        reverse("happy");
        reverse("potato");
        reverse("tacocat");
        reverse("Hello, world!");
        reverse("I am a frog");
         reverse("Jessica");
        reverse("cara huang");
    }
    
}
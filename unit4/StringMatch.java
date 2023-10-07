public class StringMatch{
    public static int stringMatch(String a, String b) {
        int n = 0;
        for(int i=0; i+1<(a.length()+b.length())/2-(Math.abs(a.length()-b.length())/2); i++){
            if (a.substring(i,i+2).equals(b.substring(i,i+2))){
                n++;
            }
        }
        return n;
    }
      
    public static void testStringMatch(String a, String b, int expected){
        int result = stringMatch(a,b);
        
        System.out.println("String a = "+a+"String b = "+b+" expected = "+expected+" result = "+result);
        
        if(result==expected){
            System.out.println("Yay!!!");
        }else{
            System.out.println("Nooooooooo");
        }
    }
    
    public static void main(String[] args){
        testStringMatch("xxcaazz", "xxbaaz",3);
        testStringMatch("abc", "abc",2);
        testStringMatch("abc", "axc",0);
        testStringMatch("hello", "he",1);
        testStringMatch("", "hello",0);
        testStringMatch("iaxxai", "aaxxaaxx",3);
    }
}
public class Attention{
    public static boolean attention(String str){
        if(str.length()>=8){
          return(str.substring(0,8).equals("Hey you!"));
        }else{
            return false;
        }
              
    }
    public static void testAttention(String str, boolean expected){
        boolean result = attention(str);
        
        System.out.println("str = "+str+" expected = "+expected+" result = "+result);
        
        if (expected == result){
            System.out.println("YAYYY");
        }else{
             System.out.println("noooooo");
        }
    }
    public static void main(String[] args){
        testAttention("Hey you!",true);
      //  testAttention("Hello",false);
        testAttention("Hello my name is bob",false);
       testAttention("a",false);
      testAttention("Hey you! I like cheese",true);
    }
}
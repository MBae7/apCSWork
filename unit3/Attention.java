public class Attention{
    public static boolean Attention(String str){
        if(str.length()>5){
          return(str.substring(0,8).equals("Hey you!"));
        }else if (str.length()<=5){
            return false;
        }
              
    }
    public static void testAttention(String str, boolean expected){
        boolean result = Attention(str);
        
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
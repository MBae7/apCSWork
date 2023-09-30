public class BackAround{
    public static String backAround(String str){
          String i = str.substring(str.length()-1,str.length());
  
          return i+str+i;
    }
    public static void testBackAround(String str, String expected){
        String result = backAround(str);
        
        System.out.println("original = "+str+" result = "+result);
        
        if (expected.equals(result)){
            System.out.println("YAYYY");
        }else{
             System.out.println("noooooo");
        }
    }
    public static void main(String[] args){
        testBackAround("cat","tcatt");
        testBackAround("Hello","oHelloo");
        testBackAround("a","aaa");
       testBackAround("abc","cabcc");
      testBackAround("read","dreadd");
    }
}
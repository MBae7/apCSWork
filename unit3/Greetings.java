public class Greetings{
    public static String Greetings(String str){
  
          return "Hello "+str+", how are you?";
    }
    public static void testGreetings(String str, String expected){
        String result = Greetings(str);
        
        System.out.println("name = "+str+" greeting = "+result);
        
        if (expected.equals(result)){
            System.out.println("YAYYY");
        }else{
             System.out.println("noooooo");
        }
    }
    public static void main(String[] args){
        testGreetings("cat","Hello cat, how are you?");
        testGreetings("Bob","Hello Bob, how are you?");
        testGreetings("Potato","Hello Potato, how are you?");
      testGreetings("A","Hello A, how are you?");
      testGreetings("laMp","Hello laMp, how are you?");
    }
}
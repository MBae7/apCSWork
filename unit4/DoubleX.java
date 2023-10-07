public class DoubleX{
    public static boolean doubleX(String str) {
    for(int i=0; i<str.length(); i++){
        String s = str.substring(i,i+1);
        if (s.equals("x")&&str.length()>i+1){
            String s2 =str.substring(i+1,i+2);
            if(s2.equals("x")){
                return true;
            }else{
        return false;
        }
        }else{
        continue;
        }
    }
    return false;
    }

    public static void testDoubleX(String str, boolean expected){
        boolean result = doubleX(str);
        
        System.out.println("str = "+str+" expected = "+expected+" result = "+result);
        
        if (expected == result){
            System.out.println("YAYYY");
        }else{
             System.out.println("noooooo");
        }
    }
    public static void main(String[] args){
        testDoubleX("axxbb",true);	
        testDoubleX("axaxax",false);
        testDoubleX("xxxxx",true);
        testDoubleX("",false);
        testDoubleX("abc",false);
    }
}
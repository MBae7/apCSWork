public class GoodDeal
{
    public static boolean goodDeal(double originalPrice, double salePrice){
        return(salePrice<.75*originalPrice);
    }
    
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected){
        boolean result = goodDeal(originalPrice, salePrice);
        
        System.out.println("original price = "+originalPrice+" salePrice = "+salePrice+" expected = "+expected+" result = "+result);
        
        if (result == expected){
            System.out.println("yay!");
        }else{
            System.out.println("noooo!");
        }
    }
    
    public static void main(String[] args){
        testGoodDeal(100,75,false);
        testGoodDeal(200,120,true);
        testGoodDeal(345.53,260.45,false);
    }
    
}
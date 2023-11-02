public class SumOfSquares{
    public static double sumOfSquares(double[] nums){
        double count = 0;
        for(double x : nums){
            count += x*x;
            }
         return count;
        }
    public static void testSumOfSquares(double[] nums, double expected){
        double result = sumOfSquares(nums);
        
        System.out.println("result: "+result+" expected: "+expected);
        
        if (result == expected){
            System.out.println("yayyy");
        }else{
            System.out.println("boooo");  
        }
    }
    
    public static void main(String[] args){
        double[] values= {1,2,3};
        testSumOfSquares(values,14);
    }
}
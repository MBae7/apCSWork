import java.util.*;

public class SumOfSquaresArray{

    public static double sumOfSquaresArray(ArrayList<Double> nums){
     double count = 0;
         for(double x : nums){
            count += x*x;
            }
         return count;
        }
    
    
    


 public static void testSumOfSquaresArray(ArrayList<Double> nums, Double expected){
         double result = sumOfSquaresArray(nums);
        System.out.println(" expected: "+expected+" result: "+result);
        if (result == expected){
             System.out.println("yayyy");
        }else{
            System.out.println("boooo");
        }
    }
    
 public static void main(String[] args){
        //int[] nums={3,2,7,17};
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(0.0);
       // nums.add(2);
       // nums.add(3);
        //nums.add(17);
         
        ArrayList<Double> nums2 = new ArrayList<Double>();
        nums2.add(1.0);
        nums2.add(2.0);
        nums2.add(3.0);
        //nums2.add(17);
         
        ArrayList<Double> nums3 = new ArrayList<Double>();
        nums3.add(2.0);
        nums3.add(2.0);
        nums3.add(2.0);
         
        testSumOfSquaresArray(nums, 0.0);
        testSumOfSquaresArray(nums2, 14.0);
        testSumOfSquaresArray(nums3, 12.0);
    }
}
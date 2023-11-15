import java.util.*;

public class FindMax{
    public static double findMax(double[] nums){
        double max = nums[0];
        
        for(double x : nums){
            if(x>max){
                max = x;
            }
        }
        return max;
    }
    
    public static void testFindMax(double[] nums, double expected){
        double result = findMax(nums);
        
        System.out.println("expected "+expected+" result "+ result);
        
        if(result == expected){
             System.out.println("yayyy ");
        }else{
            System.out.println("nooooo ");
        }
    }
    
    public static void main(String[] args){
        double[] nums = {1.0, 2.1, 5.3};
        testFindMax(nums, 5.3);
        
        double[] nums2 = {0.0, -35.0, 90.1};
        testFindMax(nums2, 90.1);
    }
}
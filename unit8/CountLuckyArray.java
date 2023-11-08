import java.util.*;

public class CountLuckyArray{
    public static int countLuckyArray(ArrayList<Integer> nums){
        
        int count = 0;
        for(int i = 0; i<nums.size(); i++){
            if (nums.get(i)%7 == 0 || nums.get(i)%10 ==7){
                count++;
            }
        }
        System.out.println(count);
       return count;
       
    }
    

    public static void testCountLuckyArray(ArrayList<Integer> nums, int expected){
         int result = countLuckyArray(nums);
        System.out.println(" expected: "+" result: "+result);
        if (result == expected){
             System.out.println("yayyy");
        }else{
            System.out.println("boooo");
        }
    }
    
     public static void main(String[] args){
        //int[] nums={3,2,7,17};
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        //nums.add(17);
         
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(7);
        nums2.add(3);
        //nums.add(2);
        nums2.add(17);
         
        ArrayList<Integer> nums3 = new ArrayList<Integer>();
        nums3.add(107);
        nums3.add(207);
       // nums.add(3);
         
        testCountLuckyArray(nums, 0);
        testCountLuckyArray(nums2, 2);
        testCountLuckyArray(nums3, 2);
    }
    
}
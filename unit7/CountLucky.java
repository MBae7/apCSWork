public class CountLucky{
    public static int countLucky(int[] nums){
        int count = 0;
        for(int x : nums){
            if (x%7 == 0 || x%10 ==7){
                count++;
            }
        }
         System.out.println(count);
        return count;
       
    }
    
    public static void testCountLucky(int[] nums,int expected){
        int result = countLucky(nums);
        
        System.out.println(" expected: "+" result: "+result);
        if (result == expected){
             System.out.println("yayyy");
        }else{
            System.out.println("boooo");
        }
    }
    
    public static void main(String[] args){
        int[] nums={3,2,7,17};
        testCountLucky(nums, 2);
    }
    
}
    




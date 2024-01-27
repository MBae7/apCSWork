public class Computations2D
{
    public static int smallest(int[][] ints){
        int smallest = ints[0][0];
        for(int[] row: ints){
            for(int num : row){
               if(num < smallest){
                   smallest = num;
               } 
            }
        }
        return smallest;
    }
    
    public static float sum(float[][] floats){
       float sum = 0;
       for(float[] row: floats){
            for(float flo : row){
                sum += flo;
               } 
            }
          return (float)sum;
    }
    
    public static int aWords(String[][] words){
         int aWords = 0;
        for(String[] row: words){
            for(String word : row){
               if(word.substring(0,1).equals("A")){
                    aWords++;
               }
            }
        }
        return aWords;
    }

      
    
    public static void main(String[] args){
         int[][] ints = {{ 1,5,6,2},
                         { 1,4,6,2,8},
                         { 13,5,25,12}};
        
        float[][] floats = {{ 1.60f,5.23f,2.43f},
                         { 1.58f,4.38f,6.08f,18f},
                         { 13.06f,5.85f,25.91f,0.01f}};
        
        String[][] words = {{"apple", "banana", "grape"},
                            {"Hi","Aloha","nihao","bonjour"},
                            {"chem","art","APCS","math","ceramics"}};
        
        System.out.println(smallest(ints));
        System.out.println(sum(floats));
        System.out.println(aWords(words));
    }
}
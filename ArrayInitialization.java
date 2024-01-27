public class ArrayInitialization
{
    public static void main(String[] args){
        int[][] diagonal = new int[10][10];
        for(int i = 0; i<10; i++){
            for(int j=0; j<10; j++){
                if(i==j){
                    diagonal[i][j] = 1;
                }else{
                    diagonal[i][j] = 0;
                }
            }
        }
        print(diagonal);
    }
    
    public static void print(int[][] values){
        for(int[] row : values){
            for(int value : row){
                System.out.print(value + " ");
            }
             System.out.println();
        }
         System.out.println();
    }
}
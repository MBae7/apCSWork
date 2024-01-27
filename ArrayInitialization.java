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
        
        String[][] animals = {{ "tabby", "orange", "calico"},
                              { "maltese", "beagle", "pug", "poodle"},
                              { "parrot", "blue", "robin"} };
        
        printString(animals);
        
        double[][] doubles = new double[5][5];
        for(int i = 0; i<5; i++){
            for(int j=0; j<5; j++){
                  doubles[i][j] = (i+1)*10+j+1;
                }
            }
        printDouble(doubles);
        
        int[][] rows = new int[6][5];
        for(int i = 0; i<6; i++){
            for(int j=0; j<5; j++){
                rows[i][j] = i+1;
            }
        }
        
        print(rows);
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
    
     public static void printString(String[][] words){
        for(String[] row : words){
            for(String word : row){
                System.out.print(word + " ");
            }
             System.out.println();
        }
         System.out.println();
    }
    
    public static void printDouble(double[][] values){
        for(double[] row : values){
            for(double value : row){
                System.out.print(value + " ");
            }
             System.out.println();
        }
         System.out.println();
    }
}
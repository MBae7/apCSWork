public class Rectangle2D
{
    public static double averagePerimeter(Rectangle[][] rectangles)
    {
        double total = 0;
        int count = 0;
        for(Rectangle[] row : rectangles){
            for(Rectangle rect : row){
                total += rect.perimeter();
                count++;
            }
        }
        return total/count;
    }
    
    public static Rectangle greatestArea(Rectangle[][] rectangles)
    {
        int row = 0;
        int column = 0;
        double area = 0;
        
        for (int i=0; i<rectangles.length; i++)
        {
            for (int j=0; j<rectangles[i].length; j++)
            {
                if(rectangles[i][j].area() > area){
                    area = rectangles[i][j].area();
                }
            }
        }
        return rectangles[row][column];
    }
    
    public static void main(String[] args){
        Rectangle[][] rectangles = {{new Rectangle("r1",10,5), new Rectangle("r2",12,2), new Rectangle("r3",8.2,5)},
                                    {new Rectangle("r4",12.4,1.6), new Rectangle("r5",9.4,2), new Rectangle("r6",5.3,5)},
                                    {new Rectangle("r7",10.9,7), new Rectangle("r8",10,12.3), new Rectangle("r9",7.5,5)}};
        
        System.out.println(greatestArea(rectangles).name());
        System.out.println(averagePerimeter(rectangles));
    }
    
}
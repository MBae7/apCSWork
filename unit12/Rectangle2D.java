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
    
    public static String greatestArea(Rectangle[][] rectangles)
    {
        String greatest = "";
        double area = 0;
        for(Rectangle[] row : rectangles){
            for(Rectangle rect : row){
                if(rect.area() > area){
                    area = rect.area();
                    greatest = rect.name();
                }
            }
        }
        return greatest;
    }
    
    public static void main(String[] args){
        Rectangle[][] rectangles = {{new Rectangle("r1",10,5), new Rectangle("r2",12,2), new Rectangle("r3",8.2,5)},
                                    {new Rectangle("r4",12.4,1.6), new Rectangle("r5",9.4,2), new Rectangle("r6",5.3,5)},
                                    {new Rectangle("r7",10.9,7), new Rectangle("r8",10,12.3), new Rectangle("r9",7.5,5)}};
        
        System.out.println(greatestArea(rectangles));
        System.out.println(averagePerimeter(rectangles));
    }
    
}
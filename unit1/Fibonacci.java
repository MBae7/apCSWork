public class Fibonacci
{
    public static void main(String[] args)
    {
        int x = 1;
        System.out.println(x);
            int y = x+x; 
                 System.out.println(y);
        for (int i=1;i<10;){
            i=y+i;
            System.out.println(i);
            y=i+y;
            System.out.println(y);
        }
        
    }
    
}
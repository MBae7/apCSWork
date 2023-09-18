public class Fizzbuzz
{
    public static void main(String[] args)
    {
       for (int i=0; i<30; i++)
       {
           if (i%3==0 && i%5!=0)
               System.out.println("Fizz");
           else if (i%5==0 && i%3 !=0)
               System.out.println("Buzz");
           else if (i%5==0 && i%3==0)
               System.out.println("Fizzbuzz");
           else
               System.out.println(i);

       }
    }
}

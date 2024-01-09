import java.util.*;

public class ItemCalculator
{
   public static void print(ArrayList<Item> items)
    {
        for (Item i : items)
            System.out.println(i.name() + " " + i.price());
    }
    
    public static double averagePrice(ArrayList<Item> items)
    {
        double sum = 0;
        for (Item i : items)
            sum += i.price();
        return sum / items.size();
    }
    
    public static String mostPricey(ArrayList<Item> items)
    {
        String pricey = "";
        float price = 0;
        for (Item i : items){
            if(price < i.price()){
                price = i.price();
                pricey = i.name();
            }
            
        }
        return pricey;
    }

    
    public static void main(String[] args){
        Item egg = new Item("egg",10);
        Item frog = new Item("frog",20);
        Item milk = new Item("milk",15);
        Item turtle = new Item("turtle",30);
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(egg);
        items.add(frog);
        items.add(milk);
        items.add(turtle);
        
        print(items);
        System.out.println("average price "+ averagePrice(items));
        
        System.out.println("highest price "+ mostPricey(items));
        
    }
}
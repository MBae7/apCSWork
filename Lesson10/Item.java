public class Item
{

    private String name;
    private float price;
    
   public Item(String name, float price){
       this.name = name;
       this.price = price; 
   }

   public String name() {return name;}
   public float price() {return price;}
    
}
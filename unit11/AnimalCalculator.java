import java.util.*;

public class AnimalCalculator{
    public static void Print(ArrayList<Animal> animals){
         for (Animal a : animals){
             System.out.println("name: " + a.name() + " legs: "+a.legs()+" furriness: "+a.furriness());
         }
    }
        
    public static float Average(ArrayList<Animal> animals){
        int average = 0;
        
        for (Animal a : animals){
            average += a.legs();
        }
        
        average = average/animals.size();
        return average;
    }
        
    public static String FewestLegs(ArrayList<Animal> animals){
        String fewest = "";
        int i = Integer.MAX_VALUE;
        
        for(Animal a : animals){
            if (a.legs()<i){
                i = a.legs();
                fewest  = a.name();
            }
        }
        return fewest;
    }
        
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Human("Bob", 2, false));
        
        animals.add(new Spider("Charlotte", 8, true));
        
        animals.add(new Blobfish("Blobby", 0, false));
        
        animals.add(new Leafbug("Leafy", 6, false));
        
        System.out.println("Average amount of legs: "+Average(animals)+" animal with fewest legs: "+FewestLegs(animals));
        
        Print(animals);
    }
}
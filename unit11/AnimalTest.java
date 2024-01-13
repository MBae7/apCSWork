import java.util.*;

public class AnimalTest{
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Human("Bob", 2, false));
        
        animals.add(new Spider("Charlotte", 8, true));
        
        animals.add(new Blobfish("Blobby", 0, false));
        
        animals.add(new Leafbug("Leafy", 6, false));
        
        for (Animal a : animals){
             System.out.println("name: " + a.name() + " legs: "+a.legs()+" furriness: "+a.furriness());
        }
       
    }
}

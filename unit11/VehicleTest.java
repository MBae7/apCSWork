import java.util.*;

public class VehicleTest{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        Car c1 = new Car("Ferrari", 4, false);
        vehicles.add(c1);     
        vehicles.add(new Car("Racecar",3, false));
        
        vehicles.add(new Motorcycle("Yamaha", 2, false));
        vehicles.add(new Motorcycle("Harley", 2, false));
        
        vehicles.add(new Bicycle("Diamond", 2, true));
        vehicles.add(new Bicycle("Harley", 2, true));
        
        vehicles.add(new Bicycle("German", 1, true));
        vehicles.add(new Bicycle("Clown", 1, true));
        
        
        for (Vehicle v : vehicles)
        {
            System.out.println(v.name());
            System.out.println(v.wheelCount());
            System.out.println(v.isHumanPowered());
        }
    }
}
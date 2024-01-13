import java.util.*;

public class VehicleStats{
    public static int TotalWheels(ArrayList<Vehicle> vehicles){
        int total = 0;
        for (Vehicle v : vehicles ){
            total += v.wheelCount();
        }
        return total;
    }
    
    public static String[] HumanPowered(ArrayList<Vehicle> vehicles){
        int total=0;
        for (Vehicle v : vehicles){
            if(v.isHumanPowered()){
                total++;
            }
        }
        String[] result = new String[total];
        int i = 0;
        for(Vehicle v : vehicles){
            if(v.isHumanPowered()){
                result[i] = v.name();
                i++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 
        
        vehicles.add(new Car("Tesla",4, false));
        Car c1 = new Car("Ferrari", 4, false);
        vehicles.add(c1);
        
        vehicles.add(new Motorcycle("Yamaha",2, false));
        vehicles.add(new Motorcycle("Harley", 2, false));
        
         vehicles.add(new Bicycle("Diamond", 2, true));
        vehicles.add(new Bicycle("Jane", 2, true));
        
        vehicles.add(new Unicycle("German", 1, true));
        vehicles.add(new Unicycle("Clown", 1, true));
        
            System.out.println(TotalWheels(vehicles));
        String[] Human = HumanPowered(vehicles);
        for(String h : Human){
            System.out.println(h);
        }
            
        
    }
}
import java.util.*;

public class PersonStats{
    public static float averageAmount(ArrayList<Person> people){
        int result = 0;
        
        for(Person p : people){
            result += p.pets();
        }
        
        return result/people.size(); 
    }
    
    public static String mostPets(ArrayList<Person> people){
        int num  = 0;
        String result = "";
        
        for(Person p : people){
            if (num < p.pets()){
                num = p.pets();
                result = p.name();
            }
        }
        
        return result;
    }
    
    public static String[] atLeast2(ArrayList<Person> people){
        int amount = 0;
         for (Person p : people){
            if (p.pets() >= 2){
            amount ++;
            }
        }
        String[] result = new String[amount];
        int i = 0;
        
        for (Person p : people){
            if (p.pets() >= 2){
                result[i] = p.name(); 
                i++;
            }
            
        }
        
        return result;
    }
    
    public static void main (String[] args){
        Person Joe = new Person("Joe", 10);
        Person Jane = new Person("Jane", 2);
        Person John = new Person("John", 1);
        Person Jenny = new Person("Jenny", 15);
        Person Jack = new Person("Jack", 0);
        
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(Joe);
        people.add(Jane);
        people.add(John);
        people.add(Jenny);
        people.add(Jack);
        
        
        System.out.println("Average amount of pets: "+ averageAmount(people));
        System.out.println("Person with most pets: "+ mostPets(people));
        System.out.println("People with at least two pets: ");
        String[] two = atLeast2(people);
        for (String t : two){
            System.out.println(t);
        }
    }
    
}
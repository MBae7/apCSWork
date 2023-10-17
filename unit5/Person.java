public class Person{
    private String name;
    private int numberPets;
    
    public Person(String name, int numberPets){
        this.name = name;
        this.numberPets = numberPets;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getNumberPets(){
        return this.numberPets;
    }
    
    public String hello(){
        return "Hello my name is "+this.name+" and I have "+this.numberPets+" pets.";
    }
    
   
}

 
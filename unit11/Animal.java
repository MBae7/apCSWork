public class Animal{
    private String name;
    private int legs; 
    private boolean furriness; 
    
    public Animal(String name, int legs, boolean furriness){
        this.name = name;
        this.legs = legs;
        this.furriness = furriness;
    }
    
    public String name() {return name;}
    public int legs() {return legs;}
    public boolean furriness() {return furriness;}
}
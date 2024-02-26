public class Shape
{
    private String name;
    private int sides;
    
    public Shape(String name, int sides){
        this.name = name;
        this.sides = sides;
    }
    
    public String name() {return name;}
    public int sides() {return sides;}
}
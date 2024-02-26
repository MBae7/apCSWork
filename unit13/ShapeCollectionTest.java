import java.util.*;

public class ShapeCollectionTest{
    public static void main(String[] args){
        ShapeCollection hi = new ShapeCollection();
        
        hi.addShape("Triangle", 3); 
        hi.addShape("Square", 4); 
        hi.addShape("Octagon", 8);
        
        System.out.println(hi.numberOfSides("Triangle"));
        
       ArrayList<Shape> evenShapes = hi.evenShapes();
        
       for (Shape s : evenShapes){
             System.out.println(s.name());
        }
    }
}
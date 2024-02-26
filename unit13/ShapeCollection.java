import java.util.*;

public class ShapeCollection
{
    public ShapeCollection(){
        shapes = new ArrayList<Shape>();
    }
    
    public void addShape(String name, int sides){
        Shape shape = new Shape(name, sides);
        shapes.add(shape);
    }
    
    public int numberOfSides(String name){
        for (Shape s : shapes){
            if (s.name().equals(name)){
                return s.sides();
            }else{
                
            }
        }
        return 0;
    }
    
    public float sidesAverage(){
        float average = 0;
        for (Shape s : shapes){
            average += s.sides();
        }
        return average/shapes.size();
    }
    
    public ArrayList<Shape> evenShapes(){
        ArrayList<Shape> evenShapes = new ArrayList<Shape>();
        
        for(Shape s : shapes){
            if(s.sides()%2 == 1){
                evenShapes.add(s);
            }
        }
        return evenShapes;
    } 
    
    private ArrayList<Shape> shapes; 
}



public class Rectangle
{
    private String name;
    private double width;
    private double height; 
    
    public Rectangle(String name, double width, double height){
        this.name = name;
        this.width = width;
        this.height = height;
    }
    
    public  double perimeter(){
        return width*2+height*2;
    }
    
    public  double area(){
        return width*height;
    }
    
    public String name() {return name;}
    public double width() {return width;}
    public double height() {return height;}
}
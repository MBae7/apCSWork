public class Rectangle{
    private double height;
    private double base;
    
    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getBase(){
        return base;
    }
    
    public double area(){
        return base*height;
    }
    
    public double perimeter(){
        return 2*(base+height);
    }
    
    public double diagonal(){
        return Math.sqrt(base*base+height*height);
    }
}
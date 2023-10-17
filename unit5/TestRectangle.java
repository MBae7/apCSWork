public class TestRectangle{
    public static void main(String[] args){
        Rectangle r = new Rectangle(3,4);
        
        System.out.println("base = "+r.getBase());
        System.out.println("height = "+r.getHeight());
        System.out.println("area = "+r.area());
        System.out.println("perimeter = "+r.perimeter());
        System.out.println("diagonal = "+r.diagonal());
    }
}
import processing.core.*;
public class BouncingBallTest extends PApplet {
     BouncingBall b = new BouncingBall(this,200,100,1,3,20,20);
     BouncingBall b2 = new BouncingBall(this,100,150,2,2,40,3);
     BouncingBall b3 = new BouncingBall(this,300,300,3,1,30,5);
    
   public void settings(){
        size(400,400);
   }
    
    public void setup(){
       
       
        
    }
    public void draw(){
      background(0);  
      b.update();
      b.checkEdges();
      b.display();

      b2.update();
      b2.checkEdges();
      b2.display();

      b3.update();
      b3.checkEdges();
      b3.display();
    }
    
     public static void main(String[] args)
    {
        PApplet.main("BouncingBallTest");
    }
}
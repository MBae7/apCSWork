import processing.core.*;
public class BouncingBallTest extends PApplet {
     BouncingBall b = new BouncingBall(200,100,1,3,20);
     BouncingBall b2 = new BouncingBall(100,150,2,2,40);
     BouncingBall b3 = new BouncingBall(300,300,3,1,30);
    
    public void setup(){
        size(400,400);
       
        
    }
    public void draw(){
      background(250);  
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
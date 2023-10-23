import processing.core.*;
public class BouncingBall extends PApplet {
  private float x,y;
  //velocity 
  private float xv,yv;
  //optionally color and size 
  //private color c;
  private float s;
    
public BouncingBall(float x, float y, float xv, float vy, float s){
        this.x = x;
        this.y = y;
        this.xv = xv;
        this.yv = yv;
        this.s = s;
    }
    
 public void update(){
   //incremeent the position by velocity 
   x+=xv;
   y+=yv;
  }
  //check edges
 public void checkEdges(){
 if (x>width || x<0){
   xv = -1*xv;
   fill(random(255),random(255),random(255));
 }else if (y>height || y<0){
   yv = -1*yv;
      fill(random(255),random(255),random(255));
 }
  }
  //display the ball
 public void display(){
   fill(random(255),random(255),random(255));
   ellipse(x,y,s,s); 
  }
  
  
  //void color 



    
    public static void main(String[] args)
    {
        PApplet.main("BouncingBall");
    }
}
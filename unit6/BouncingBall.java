import processing.core.*;
public class BouncingBall {
  private PApplet p;
  private float x,y;
  //velocity 
  private float xv,yv;
  //optionally color and size 
  //private color c;
  private float s;
  private float c;
    
public BouncingBall(PApplet p, float x, float y, float xv, float yv, float s, float c){
        this.p = p;
        this.x = x;
        this.y = y;
        this.xv = xv;
        this.yv = yv;
        this.s = s;
        this.c = c;
    }
    
 public void update(){
   //incremeent the position by velocity 
   x+=xv;
   y+=yv;
  }
  //check edges
 public void checkEdges(){
 if (x>p.width || x<0){
   xv = -1*xv;
   p.fill(p.random(255),p.random(255),p.random(255));
 }else if (y>p.height || y<0){
   yv = -1*yv;
      p.fill(p.random(255),p.random(255),p.random(255));
 }
  }
  //display the ball
 public void display(){
   p.fill(x+c,y*c/4,(x+y)/c*2);
   p.ellipse(x,y,s,s); 
  }
  
  
  //void color 



}
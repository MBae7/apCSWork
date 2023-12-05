import processing.core.*;
public class Arrows{
  private PApplet p;
  private float x,y;
  private float xt;
  //velocity 
  private float yv;
  //optionally color and size 
  //private color c;
  private float s;
  private float d; //direction
  private float initialY=20;
    
public BouncingBall(PApplet p, float x, float y, float yv, float s, float d){
        this.p = p;
        this.x = x;
        this.y = y;
        this.yv = yv;
        this.s = s;
        this.d = d;
    }
    
 public void update(){
   //incremeent the position by velocity 
  // x+=xv;
   y+=yv;
  }
  //check edges
 public void checkEdges(){
 /*if (x>p.width || x<0){
  xv = -1*xv;
   p.fill(p.random(255),p.random(255),p.random(255));*/
  if (y>p.height || y<0){
   y= initialY;
   xt = int(random(1,5));
   x = (xt/5)*width;
   }


 }
  }
  //display the ball
 public void display(){
   p.fill(x+c,y*c/4,(x+y)/c*2);
   p.ellipse(x,y,s,s); 
  }
   
} 
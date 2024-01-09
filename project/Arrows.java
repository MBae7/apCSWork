import processing.core.*;
public class Arrows{
  private PApplet p;
  private float x,y;
  private int xt;
  //velocity 
  private float yv;
  //optionally color and size 
  //private color c;
  private int s;
  private String d; //direction
  private float initialY;
  private PImage up,down,left,right;
    
public Arrows(PApplet p, float x, float y, float yv, int s, String d){
        this.p = p;
        this.x = x;
        this.y = y;
        this.yv = yv;
        this.s = s;
        this.d = d;
        initialY = p.height;
    
        up = p.loadImage("Up.png");
        up.resize(s, s);
    
        down = p.loadImage("Down.png");
        down.resize(s, s);
    
        left = p.loadImage("Left.png");
        left.resize(s, s);
    
        right = p.loadImage("Right.png");
        right.resize(s, s);
    }
    
 public void update(){
   //incremeent the position by velocity 
  // x+=xv;
   y-=yv;
  }
  //check edges
 public void checkEdges(){
 /*if (x>p.width || x<0){
  xv = -1*xv;
   p.fill(p.random(255),p.random(255),p.random(255));*/
  if (y>p.height || y<0){
   y= initialY;
   xt = (int)(p.random(1,5));
     // xt=5;
   x = (xt)*p.width/5;
   }


 }
  

 public void display(){
  // p.fill(x+c,y*c/4,(x+y)/c*2);
 if(d == "up"){
    p.image(up, x, y);
    }
if(d == "down"){
    p.image(down, x, y);
    }
if(d == "left"){
    p.image(left, x, y);
    }
if(d == "right"){
    p.image(right, x, y);
    }
 }
    

   
} 
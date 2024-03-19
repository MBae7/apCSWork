import processing.core.*;
import java.util.*;
public class ArrowHoles{
  private PApplet p;
  private float x,y;
  private int xt;
  //velocity 
  private float yv;
  //optionally color and size 
  //private color c;
  private int s;
  private String d; //direction
  private PImage up,down,left,right;
    
    
  public ArrowHoles(PApplet p, float x, float y, int s, String d){
        this.p = p;
        this.x = x;
        this.y = y;
        this.s = s;
        this.d = d;
    
           up = p.loadImage("UpHole.png");
     down = p.loadImage("DownHole.png");
         left = p.loadImage("LeftHole.png");
     right = p.loadImage("RightHole.png");
        
        right = p.loadImage("RightHole.png");
        right.resize(s*2, s*2);
    }
    
    public void display(){
        p.rectMode(p.CENTER);
  // p.fill(x+c,y*c/4,(x+y)/c*2);
 if(d == "up"){
    p.image(up, x, y);
  
        up.resize(s, s);
    }
if(d == "down"){
    p.image(down, x, y);
   
     down.resize(s, s);   
    }
if(d == "left"){
    p.image(left, x, y);
   
        left.resize(s, s);
    
    }
if(d == "right"){
    p.image(right, x, y);
    
        right.resize(s, s);
    }
 }
    
    public float x() {return x;}
    public float y() {return y;}
    public int s() {return s;}
    

}
import processing.core.*;
import java.util.*;
public class Arrows{
  private Dance p;
  private float x,y;
  private int xt;
  //velocity 
  private float yv;
  //optionally color and size 
  //private color c;
  private int s;
  private String d; //direction
  private PImage up,down,left,right;
    
    
public Arrows(Dance p, float x, String d){
        this.p = p;
        this.x = x;
        y = p.height;
        yv = 3;
        s = 75;
        this.d = d;
    
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
   y-=yv;
  }
    
  //check edges
 public boolean offScreen(){
  return (y>p.height || y<0);  
 }

 public void display(){
       p.rectMode(p.CENTER);
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
    
    public float x() {return x;}
    public float y() {return y;}
    public float yv() {return yv;}
    public int s() {return s;}
    public String d() {return d;}
   
} 
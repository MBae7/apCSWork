import processing.core.*;
public class Dance extends PApplet {
    ArrayList<Arrows> arrows;
    Arrows a;
    Arrows d;
    Arrows l;
    //PImage gback;
   public void settings(){
        fullScreen();
   }
    
    public void setup(){
       arrows = new ArrayList<Arrows>();
       a = new Arrows(this,200,height,3,75,"up");
       d = new Arrows(this,300,height,3,75,"down");
       l = new Arrows(this,400,height,3,75,"left");
       
        state = "GAME";
    }
    public void draw(){
        
      background(0);  
        
    if(state == "GAME"){
        Arrow a = new Dot()
    }
        
      a.update();
      a.checkEdges();
      a.display();
      
      
      d.update();
      d.checkEdges();
      d.display();
        
      l.update();
      l.checkEdges();
      l.display();
    
        /*if (state == "START") {
            drawStart();
        } else if (state == "GAME") {
        drawGame();
        } else if (state == "END") {
        drawEnd();
        resetGame();
        }
    }
    
    public void drawStart(){
        
    }
    
    
    public void drawGame{
     */   
    }
        
     public static void main(String[] args)
    {
        PApplet.main("Dance");
    }
}
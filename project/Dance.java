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


/* task list
    - get arrow holes to display
    - get keypress collision detection between arrows and arrow holes
    - if collides move arrow (back to bottom for now?) 
    - make a lot of arrows, make sure collisions still work
        - remove arrow when collides, be constantly making new arrows, timed out?
        - add in score, if collides add to scor and remove from list, if goes off top, don't add in score and remove from list 
    - add in music 
    - figure out how want music and 
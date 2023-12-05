import processing.core.*;
public class Dance extends PApplet {

    //PImage gback;
   public void settings(){
        fullScreen();
   }
    
    public void setup(){
       
       
        state = "START";
    }
    public void draw(){
        if (state == "START") {
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
        
    }
     public static void main(String[] args)
    {
        PApplet.main("Dance");
    }
}
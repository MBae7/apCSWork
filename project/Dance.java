import processing.core.*;
import java.util.*;
public class Dance extends PApplet {
    ArrayList<Arrows> arrows = new ArrayList<Arrows>();
    Arrows u;
    Arrows d;
    Arrows l;
    Arrows r;
    
    ArrayList<ArrowHoles> holes = new ArrayList<ArrowHoles>();;
    ArrowHoles uh;
    ArrowHoles dh;
    ArrowHoles lh;
    ArrowHoles rh;
    
    String state;
    
    int score = 0;
    
     boolean KeyPressed = false;
    //PImage gback;
   public void settings(){
        fullScreen();
   }
    
    public void setup(){
    //   arrows = new ArrayList<Arrows>();
       u = new Arrows(this,200,height,3,75,"up");
       d = new Arrows(this,300,height,3,75,"down");
       l = new Arrows(this,400,height,3,75,"left");
       r = new Arrows(this,500,height,3,75,"right");
       
        
       //  holes = new ArrayList<ArrowHoles>();
       uh = new ArrowHoles(this,200,100,75,"up");
       dh = new ArrowHoles(this,300,100,75,"down");
       lh = new ArrowHoles(this,400,100,75,"left");
       rh = new ArrowHoles(this,500,100,75,"right");
        
        state = "GAME";
    }
    public void draw(){
        
      background(0);  
        
    if(state == "GAME"){
      drawGame(); 
        
    }
        
     
    
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
      */  
    }
    
    
    public void drawGame(){
        
       if (u.d().equals("up") && keyCode == UP && KeyPressed) {
            if (u.x() == uh.x() && u.y() >= uh.y() - uh.s() && u.y() <= uh.y() + uh.s()) {
                score++;
                System.out.println(score);
                u.initialY();
            }
        }
        if (d.d().equals("down") && keyCode == DOWN && KeyPressed) {
            if (d.x() == dh.x() && d.y() >= dh.y() - dh.s() && d.y() <= dh.y() + dh.s()) {
                score++;
                System.out.println(score);
                d.initialY();
            }
        }
        if (l.d().equals("left") && keyCode == LEFT && KeyPressed) {
            if (l.x() == lh.x() && l.y() >= lh.y() - lh.s() && l.y() <= lh.y() + lh.s()) {
                score++;
                System.out.println(score);
                l.initialY();
            }
        }

        if (r.d().equals("right") && keyCode == RIGHT && KeyPressed) {
            if (r.x() == rh.x() && r.y() >= rh.y() - rh.s() && r.y() <= rh.y() + rh.s()) {
                score++;
                System.out.println(score);
                r.initialY();
            }
        }
        
       u.update();
       u.checkEdges();
       u.collision(holes);
        u.display();
        
        d.update();
       d.checkEdges();
       d.collision(holes);
        d.display();
        
        l.update();
       l.checkEdges();
       l.collision(holes);
        l.display();
        
        r.update();
       r.checkEdges();
       r.collision(holes);
        r.display();
        
        uh.display();
        dh.display();
        lh.display();
        rh.display();
        
        text("score: "+score, 600,100);
    }
    
   /* public void keyPressed(){
        if (u.d().equals("up") && keyCode == UP){
            if(u.x()==uh.x() && u.y()>=uh.y()-uh.s() && u.y()<=uh.y()+uh.s()){
                score++;
                System.out.println(score);
                u.initialY();
            }
        }
    }*/
    
    public void keyPressed() {
        // Set the flag when 'UP' key is pressed
        KeyPressed = true;
    }
        
    public void keyReleased() {
        // Reset the flag when 'UP' key is released
            KeyPressed = false;
    }
    
     public static void main(String[] args)
    {
        PApplet.main("Dance");
    }
    
     public int score() {return score;}
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
    */
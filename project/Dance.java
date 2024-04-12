import processing.core.*;
import processing.sound.*;
import java.util.*;
public class Dance extends PApplet {
    ArrayList<Arrows> arrows = new ArrayList<Arrows>();
    Arrows first;
    

    SoundFile audible;
    SoundFile beat;
    
    BeatDetector bD;
    
    ArrayList<ArrowHoles> holes = new ArrayList<ArrowHoles>();
    ArrowHoles uh;
    ArrowHoles dh;
    ArrowHoles lh;
    ArrowHoles rh;
    
    String arrow = "";
    
    String kungFu = "KungFuFighting.wav";
    
    String byeByeBye = "ByeByeBye.wav";
    
    String that = "That'stheway.wav";
    
   String song = that;
    
    
    int num = 0;
    
    String state;
     boolean played = false;
    
    
    int score = 0;
    
     boolean KeyPressed = false;
    //PImage gback;
   public void settings(){
        fullScreen();
       //size(800,displayHeight);
   }
    
    public void setup(){
    //   arrows = new ArrayList<Arrows>();
       
        
       first = new Arrows(this,num*100,arrow);
       arrows.add(first);
    
       beat = new SoundFile(this, song);
       beat.play();
       beat.amp((float)0.2);
    
       bD = new BeatDetector(this);
       bD.input(beat);
       bD.sensitivity(180);
        
       
        
            
       audible = new SoundFile(this, song);
       audible.amp(1);
        
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

    if (first.y() >= uh.y() - uh.s() && first.y() <= uh.y() + uh.s()&&played==false) {
      audible.play();  
        played = true;
     }
        
        
    if(bD.isBeat()){
        println("Beat Detected");
            addArrow();
      text("beat detected1",600,200);
       
    }

       Iterator<Arrows> iterator = arrows.iterator(); // Initialize iterator here
        
        while (iterator.hasNext()) {
            Arrows a = iterator.next();
            a.update();
            if(a.offScreen()){
                iterator.remove();
            } else {
                a.display();
            }
        }
        
  
        
        uh.display();
        dh.display();
        lh.display();
        rh.display();
        
        text("score: "+score, 600,100);
    }
    
    public void addArrow(){
        num = (int)(Math.random()*4)+2;
        System.out.println(num);
        if(num == 2){
            arrow = "up";
        }else if(num == 3){
            arrow = "down";
        }else if(num == 4){
            arrow = "left";
        }else if(num == 5){
            arrow = "right";
        }
        System.out.println(arrow);
        
        Arrows newArrow = new Arrows(this,num*100,arrow);
        arrows.add(newArrow);
        
       /* Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                addArrow(); 
            }
        }, 1000); 
        */
        
        
    }
    
    
    public void keyPressed() {
     
        
   Iterator<Arrows> iterator = arrows.iterator();
    while (iterator.hasNext()) {
        Arrows a = iterator.next();
        if (a.d().equals("up") && keyCode == UP) {
            if (a.x() == uh.x() && a.y() >= uh.y() - uh.s() && a.y() <= uh.y() + uh.s()) {
                score++;
                System.out.println(score);
                iterator.remove(); 
            }
        }
        if (a.d().equals("down") && keyCode == DOWN) {
            if (a.x() == dh.x() && a.y() >= dh.y() - dh.s() && a.y() <= dh.y() + dh.s()) {
                score++;
                System.out.println(score);
                iterator.remove(); 
            }
        }
        if (a.d().equals("left") && keyCode == LEFT) {
            if (a.x() == lh.x() && a.y() >= lh.y() - lh.s() && a.y() <= lh.y() + lh.s()) {
                score++;
                System.out.println(score);
                iterator.remove(); 
            }
        }
        if (a.d().equals("right") && keyCode == RIGHT) {
            if (a.x() == rh.x() && a.y() >= rh.y() - rh.s() && a.y() <= rh.y() + rh.s()) {
                score++;
                System.out.println(score);
                iterator.remove(); 
            }
        }
    }

    }
        
   
     public static void main(String[] args)
    {
        PApplet.main("Dance");
    }
    
     public int score() {return score;}
}





/* ways 
        - add in diff tracks
        - 
    */
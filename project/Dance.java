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
    
    String bye = "ByeByeBye.wav";
    
    String that = "That'stheway.wav";
    
    String song = bye;
    
    int lives = 10;
    int livesX = width/2;
    int livesY = height/9;
    int barW = 200;
    int barH = 40;
    
    int startX = 350;
    int tutorialX = startX+350;
    int buttonY = 700;
    int buttonW = 400;
    int buttonH = 100;
    
    PImage start, sButton, tButton, bar;
    
    
    int num = 0;
    
    String state;
     boolean played = false;
    boolean play = false;
    
    
    int score = 0;
    
     boolean KeyPressed = false;
    //PImage gback;
   public void settings(){
        fullScreen();
       //size(800,displayHeight);
   }
    
    public void setup(){
    //   arrows = new ArrayList<Arrows>();
      start = loadImage("Start.png");
        start.resize(width, height);
      sButton = loadImage("startButton.png");
        sButton.resize(buttonW,buttonH);
      tButton = loadImage("tutorialButton.png");
        tButton.resize(buttonW,buttonH);
        
        bar = loadImage("lives.png");
        bar.resize(barW, barH);
    
        
        
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
       uh = new ArrowHoles(this,400,100,75,"up");
       dh = new ArrowHoles(this,300,100,75,"down");
       lh = new ArrowHoles(this,200,100,75,"left");
       rh = new ArrowHoles(this,500,100,75,"right");
        
        state = "START";
           
    }
    public void draw(){
        
      background(0);  
    
    
     if (state == "START") {
        drawStart();
     } else if (state == "GAME") {
        drawGame();
     } else if (state == "TUTORIAL") {
        drawTutorial();
     } else if (state == "END") {
        drawEnd();
      //  resetGame();
     }
    }
    
    public void drawStart(){
      image(start, 0, 0);
      image(sButton, startX, buttonY);
      image(tButton, tutorialX, buttonY);
        
        
    }
    
    public void drawTutorial(){
        
    }
    
    
public void drawGame(){
    if(play == false){
        beat.play();
        play = true;
    }
    
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
                lives--;
                if(lives<=0){
                    state = "END";
                }
            } else {
                a.display();
            }
        }
        
  
        
        uh.display();
        dh.display();
        lh.display();
        rh.display();
  //  livesBar();
        
        text("score: "+score, 1000,100);
    text("lives: "+lives, 820,100);
         image(bar, livesX, livesY);
    }
    /*
    public void livesBar(){
        rect(livesX+20,livesY,barW/10*lives,barH);
    }
    */
    
    public void drawEnd(){
        
    }
    

    
    public void addArrow(){
        num = (int)(Math.random()*4)+2;
        System.out.println(num);
        if(num == 4){
            arrow = "up";
        }else if(num == 3){
            arrow = "down";
        }else if(num == 2){
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
   public void mouseClicked(){
        if(state == "START" && mouseY>=buttonY && mouseY<=buttonY+buttonH){
            if(mouseX>=startX && mouseX<=startX+buttonW){
                state = "GAME";
            }else if(mouseX>=tutorialX && mouseX<=tutorialX+buttonW){
                state = "TUTORIAL";
            }
        }
   } 
    
    public int findTop(){
         int highest = 0;
         for(int i = 1; i<arrows.size(); i++){
            if(arrows.get(i).y()<arrows.get(highest).y()){
                highest = i;
            }
         }
        rect(arrows.get(highest).x(),arrows.get(highest).y(), 60,60);
        return highest;
        
            
    }
     
    public void keyPressed(){
        int index = findTop();
        Arrows current = arrows.get(index);
        if((current.d().equals("up") && keyCode == UP)||(current.d().equals("right") && keyCode == RIGHT)||(current.d().equals("down") && keyCode == DOWN)||(current.d().equals("left") && keyCode == LEFT)){
        
        
        score += (int)((uh.y()-arrows.get(index).x()));
        System.out.println(score);
        arrows.remove(index); 
        }
     
        
  /* Iterator<Arrows> iterator = arrows.iterator();
    while (iterator.hasNext()) {
        Arrows a = iterator.next();
        if (a.d().equals("up") && keyCode == UP) {
           /* if (a.x() == uh.x() && a.y() >= uh.y() - uh.s() && a.y() <= uh.y() + uh.s()) {
                score++;
                System.out.println(score);
            
           
                score += (int)MATH.abs((uh.y()-highest));
                System.out.println(score);
                iterator.remove(); 
            //}
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
    */

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
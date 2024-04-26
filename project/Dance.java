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
    
    String song = that;
    
    int initial = 16;
    
    int lives = initial;
    int livesX;
    int livesY;
    int barW;
    int barH;
    
    int startX;
    int tutorialX;
    int buttonY;
    int buttonW;
    int buttonH;
    
    PImage start, sButton, tButton, bar;
    
    
    int num = 0;
    
    int scoreX;
    int scoreY;
    int text;
    
    String state;
     boolean played = false;
    boolean play = false;
    
    //boolean one = true;
    
    
    int score = 0;
    
     boolean KeyPressed = false;
    //PImage gback;
   public void settings(){
        fullScreen();
       
   }
    
    public void setup(){
    //   arrows = new ArrayList<Arrows>();
        livesX = width/2;
        livesY = height/9;
        barW = 3*width/14;
        barH = 3*height/44;
    
        startX = (int)(width/4.2);
        tutorialX = (int)(startX*2.1);
        buttonY = height/40*29;
        buttonW = (int)(width/1.8);
        buttonH = height/6;
        
        
      start = loadImage("Start.png");
        start.resize(width, height);
      sButton = loadImage("startButton.png");
        sButton.resize(buttonW,buttonH);
      tButton = loadImage("tutorialButton.png");
        tButton.resize(buttonW,buttonH);
        
        bar = loadImage("lives.png");
        bar.resize(barW, barH);
    
        
       initialize();
    
       beat = new SoundFile(this, song);
       
       beat.amp((float)0.2);
    
       bD = new BeatDetector(this);
       bD.input(beat);
       bD.sensitivity(180);
       //beat.play(); 
       
        
            
       audible = new SoundFile(this, song);
       audible.amp(1);
        
       //  holes = new ArrayList<ArrowHoles>();
       uh = new ArrowHoles(this,(int)(4*width/13),100,75,"up");
       dh = new ArrowHoles(this,(int)(3*width/13),100,75,"down");
       lh = new ArrowHoles(this,(int)(2*width/13),100,75,"left");
       rh = new ArrowHoles(this,(int)(5*width/13),100,75,"right");
        
        state = "START";
           
    }
    
    public void initialize(){
        arrows = new ArrayList<Arrows>();
        first = new Arrows(this,num*100,arrow);
       arrows.add(first);
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
     }else if (state == "RESET"){
         drawReset();
     }
    
    }
    
    public void drawStart(){
      image(start, 0, 0);
      image(sButton, startX, buttonY);
        lives = initial;
      //image(tButton, tutorialX, buttonY);
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
       
    }

       Iterator<Arrows> iterator = arrows.iterator(); // Initialize iterator here
        
        while (iterator.hasNext()) {
            Arrows a = iterator.next();
            a.update();
            if(a.offScreen()){
                iterator.remove();
               //if(one == false){
                lives--;
                //}
                 //one = false; 
                //state = "END";
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
         livesBar();
        image(bar, livesX, livesY);
    
        scoreX= 15*width/20; 
        scoreY = 7*height/40-10;
    
    
        text = 50;
        textSize(text);
        text("score: "+score,scoreX,scoreY);
    //text("lives: "+lives, 820,100);
    
        if(audible.isPlaying()==false && played ==true){
            state = "END";
        }
    }
    
    public void livesBar(){
        rectMode(CORNER);
      /*  while(lives<11){
    int rectWidth = (int)(lives * barW) / 10; // Adjust scaling factor as needed
    rect(livesX + 20, (int)(livesY+height/15), rectWidth, 10);
        }
        */
        if(lives<initial){
          int rectWidth = (lives * barW)/initial-1; // Adjust scaling factor as needed
            rect(livesX, (int)(livesY*1.1), rectWidth, barH-barH/2);
    }else{
            int rectWidth = barW;
            rect(livesX, (int)(livesY*1.1), rectWidth, barH-barH/2);
        }
   
    }
    
    
    public void drawEnd(){
        if(beat.isPlaying()){
        beat.stop();
        }
        if(audible.isPlaying()){
        audible.stop();
        }
        
        textSize(text);
        text("score: "+score,scoreX,scoreY);
        if(scoreX>width/3&&scoreY<height/2){
        scoreX=scoreX-5;
        scoreY=scoreY+2;
        text++;
          
        }
          image(sButton, startX, buttonY);
        System.out.println(scoreX +" "+ scoreY +" "+text);
        
    }
    
    public void drawReset(){
        played = false;
        play = false;
       score =0;
        lives = initial;
        initialize();
        state = "GAME";
        
        
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
        
        Arrows newArrow = new Arrows(this,(int)num*width/13,arrow);
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
        if( mouseX>=startX && mouseX<=startX+buttonW && mouseY>=buttonY && mouseY<=buttonY+buttonH){
            if(state == "START"){
                state = "GAME";
            }else if(state =="END"){
                state = "RESET";
            }
        }
   } 
    
    public int findTop(){
        if (arrows.isEmpty()) {
        return 0; 
    }
         int highest = 0;
         for(int i = 1; i<arrows.size(); i++){
            if(arrows.get(i).y()<arrows.get(highest).y() && arrows.get(i).y()>uh.y()-uh.s()){
                highest = i;
            }
         }
      //  rect(arrows.get(highest).x(),arrows.get(highest).y(), 60,60);
        return highest;
        
            
    }
     
    public void keyPressed(){
      
        if(arrows.size()!=0){
        int index = findTop();
        Arrows current = arrows.get(index);
        if((current.d().equals("up") && keyCode == UP)||(current.d().equals("right") && keyCode == RIGHT)||(current.d().equals("down") && keyCode == DOWN)||(current.d().equals("left") && keyCode == LEFT)){  
            score += (int)(100-abs(uh.y()-arrows.get(index).x())/10);
            System.out.println(100-abs(uh.y()-arrows.get(index).x())/10);
            System.out.println(score);
            arrows.remove(index); 
                               }
                    }
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
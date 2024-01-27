public class Car implements Vehicle{
   private String name;
   /* private int wheelCount;
    private boolean isHumanPowered;*/
    
    public Car(String name){
        this.name = name;
       // this.wheelCount = wheelCount;
      //  this.isHumanPowered = isHumanPowered;
    }
    
    public String name() {return name;}
    public int wheelCount() {return 1;}
    public boolean isHumanPowered() {return true;}
}
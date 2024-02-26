import java.util.*;
public class Student
{
    private String name;
    private int favNum;
    
    public Student(String name, int favNum){
        this.name = name;
        this.favNum = favNum;
    }
    
    public String name(){return name;}
    public int favNum(){return favNum;}
}
import java.util.*;
public class Teacher
{
    private String name;
    private String subject;
    
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    
    public String name(){return name;}
    public String subject(){return subject;}
}
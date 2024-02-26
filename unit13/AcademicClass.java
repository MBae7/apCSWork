import java.util.*;
public class AcademicClass{
    
    public AcademicClass(String teacherName, String subject){
        teacher = new Teacher(teacherName, subject);
        students = new ArrayList<Student>();
    }
    
    public void addStudent(String name, int favNum){
       Student student = new Student(name,favNum);
       students.add(student);
    }

    
    public void printInfo(){
        for(Student s : students){
             System.out.println(s.name());
        }
         System.out.println("teacher: "+teacher.name());
    }
    
    public ArrayList<Student> favNums(int n){
        ArrayList<Student> matchNum = new ArrayList<Student>();
        for(Student s : students){
            if(s.favNum() == n){
                matchNum.add(s);
            }
        }
        return matchNum;
    }
    
    public ArrayList<Student> oddFavs(){
        ArrayList<Student> oddFavs = new ArrayList<Student>();
        for(Student s : students){
            if(s.favNum()%2==1){
                oddFavs.add(s);
            }
        }
        return oddFavs;
    }

    
    
    private Teacher teacher;
    private ArrayList<Student> students;
}
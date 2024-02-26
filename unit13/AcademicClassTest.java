import java.util.*;
public class AcademicClassTest{
    public static void main(String[] args){
        AcademicClass coding = new AcademicClass("Dr.Kessner","coding");
        
        coding.addStudent("Mia",57);
        coding.addStudent("Nina",36);
        coding.addStudent("Jane",17);
        coding.addStudent("Nola",14);
        
        coding.printInfo();
        
        ArrayList<Student> favNum17 = coding.favNums(17);
        for(Student s : favNum17){
        System.out.println(s.name());
        }
        
        ArrayList<Student> oddNum = coding.oddFavs();
        for(Student s : oddNum){
        System.out.println(s.name());
        }
    }
}
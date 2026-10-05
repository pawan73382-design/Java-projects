public class constructor {
    public static void main(String[]args){
        Student st1 = new Student();
        st1.name = "Nandini";
        st1.dept = "AIML";
        Student st2 = new Student("Rashmi", "AIML");
        System.out.println(st2.dept);
    }
    
}
class Student{
    String name;
    String dept;
    Student(){
    }
    Student(String name, String dept){
        this.name = name;
        this.dept = dept;
    }
    void doExams(){
        System.out.println("student has topped");
    }
}

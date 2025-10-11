public class StudentObject {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    StudentObject(String a, int b, double c){
        this.name = a; // this. is for working with current object (like student1 or student2)
        this.age = b;  // refers to obj we r currently working with
        this.gpa = c;  // it replaces whateevr is passed to student1, stud2 values, like student1.name = this.name
        isEnrolled = true; // no need of parameter for this
    }

    void study(){
        System.out.println(this.name + " is studying.");    
    }
    
}

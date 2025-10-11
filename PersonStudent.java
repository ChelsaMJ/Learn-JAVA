public class PersonStudent extends PersonObject{

    double gpa;

    PersonStudent(String first, String last, double gpa){
        super(first, last);
        this.gpa =gpa;
    }

    void showGpa(){
        System.out.println(this.first+"'s gpa is "+this.gpa);
    }
    
}

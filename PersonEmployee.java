public class PersonEmployee extends PersonObject{
    
    int salary;

    PersonEmployee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first+"'s salary is "+this.salary);
    }
}

public class PersonMain {
    public static void main(String args[]){

        PersonObject person = new PersonObject("Tom", "Riddle");
        PersonStudent student = new PersonStudent("Harry", "Potter", 3.25);
        PersonEmployee employee = new PersonEmployee("Rubeus", "Hagrid", 50000);
        

        person.showName();  
        student.showName();
        student.showGpa();
        employee.showName();
        employee.showSalary();
    }
}

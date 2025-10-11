public class StudentMain {
    public static void main(String[] args){

        StudentObject student1 = new StudentObject("Amanda", 18, 9.5);
        StudentObject student2 = new StudentObject("Benedict", 22, 8.25);


        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        System.out.println();


        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println();

        student1.study();
        student2.study();




    }
    
}

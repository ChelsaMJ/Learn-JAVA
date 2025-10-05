public class Method2 {
    public static void main(String[] args) {

        // happyBday method call
        String name = "John";
        int age = 25;
        
        happyBday(name, age); //arguments

        // square method call
        int num = 5;
        System.out.println(square(num));

        // cube method call
        System.out.println(cube(num));

        // getFullName method call
        String firstName = "John";
        String lastName = "Doe";    
        System.out.println(getFullName(firstName, lastName));
        // oR
        System.out.println(getFullName("Jane", "Smith"));

        // age checking
        int personAge = 17;
        if(ageCheck(personAge)){ // if ageCheck method returns true
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sign up!");
        }

        

    }
    // happyBday method
    static void happyBday(String birthdayBoy, int age) { //parameters

        System.out.printf("Happy Birthday to you %s!%n", birthdayBoy);
        System.out.printf("You are %d years old!%n", age);
    }

    // square method
    static double square(double num){
        return num*num;
    }

    // cube method
    static double cube(double num){
        return num*num*num;
    }

    // getFullName method
    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    // ageCheck method
    static boolean ageCheck(int age){
        if(age >= 18){ // instead of if-else, i can just write return age >= 18 for a bool answer
            return true;
        } else {
            return false;
        }
    }


}

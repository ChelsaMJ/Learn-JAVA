public class UserMain {
    public static void main(String args[]){

        UserObject user1 = new UserObject("Ceros");
        UserObject user2 = new UserObject("Egor", "Egor101@email.com");
        UserObject user3 = new UserObject("Metra", "MetraNight@gmail.com", 23);
        UserObject user4 = new UserObject();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        // no args provided
        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }

    
}

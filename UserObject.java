public class UserObject {
    
    String username;
    String email;
    int age;

    // constructor that accepts no arguments - anonymous profiles
    UserObject(){
        this.username = "guest";
        this.email = "not provided";
        this.age = 0;
    }

    UserObject(String username){
        this.username = username;
        this.email = "not provided";
        this.age = 0;
    }

    UserObject(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    UserObject(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}

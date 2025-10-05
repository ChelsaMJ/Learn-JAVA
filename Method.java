public class Method {
    public static void main(String[] args) {
        happyBday();
        happyBday();    
        happyBday();
        // Cannot make a static reference to the non-static method happyBday() from the type Method
        // have to make happyBday static

    }

    static void happyBday() {
        System.out.println("Happy Birthday to you! XOXO");
        System.out.println("Happy Birthday to you! XOXOXO");
        System.out.println("Happy Birthday to you! XOXOXOXO\n");
    }
}

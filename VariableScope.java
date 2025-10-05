public class VariableScope {

    static int y = 3; // CLASS var or GLOBAL var
    public static void main(String[] args){
        int x = 1; //LOCAL var of main

        System. out. println(x);
        doSomething();
        System. out. println(y);
    }

    static void doSomething(){
        int x = 2; //LOCAL var of doSomething

        System. out. println(x) ;
}
    
}

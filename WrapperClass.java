public class WrapperClass {
    public static void main(String args[]){

        // Integer a = new Integer(123); 
        // The constructor Integer(int) has been deprecated since version 9 and marked for removal

        //Autoboxing
        Integer a =123;
        Double b =3.14;

        //Unboxing
        int x =a;
        double y = b;

        System.out.println(a +" "+ b+" " + x+" " + y);

        // toString()
        String p = Integer.toString(123); 
        String q = Double.toString(3.14); 
        String r = Boolean.toString(false); 
        String s = Character.toString('$'); 

        System.out.println(p +" "+ q+" " + r+" " + s);

        //parsing
        int a1 = Integer.parseInt("123"); // string to int
        double b1 = Double .parseDouble( "3.14") ; // string to double etc
        char c1 = "Pizza".charAt(0);
        boolean d1 =Boolean .parseBoolean( "true") ;

        System.out.println(a1 +" "+ b1+" " + c1+" " + d1);

        //isLetter()
        char letter ='b';
        char letterr = '$';
        System. out. println(Character. isLetter(letter) ) ;
        System. out. println(Character. isLetter(letterr) ) ;
        System. out. println(Character. isUpperCase(letter) ) ;



    }
}

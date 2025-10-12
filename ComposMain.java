public class ComposMain {

    public static void main(String args[]){

    ComposCar car = new ComposCar("Corvette", 2025,"V8" ) ;

    System. out. println (car. model) ;
    System. out. println (car. year) ;
    System. out. println (car. engine) ; // gives address cuz engine is an object // reference dt
    System. out. println (car. engine.type) ; // access type from engine

    car.start();

    }
    
}

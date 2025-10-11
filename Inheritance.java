public class Inheritance {
    public static void main(String args[]){
    
    Dog dog = new Dog();
    Cat cat = new Cat();
    Plant plant = new Plant();

    System.out.println(dog.isAlive);
    dog.eat();
    dog.speak();

    System.out.println(cat.isAlive);
    cat.eat();
    cat.speak();

    System.out.println(plant.isAlive);
    plant.photosynthesis();
}
}

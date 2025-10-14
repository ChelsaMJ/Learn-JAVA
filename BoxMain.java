public class BoxMain {
    public static void main(String[] args) {
    
        // Box can accept any type
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());

        Box<Integer> box1 = new Box<>();
        box1.setItem(101);
        System.out.println(box1.getItem());
    
    
    }
}

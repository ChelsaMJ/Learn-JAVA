public class ProductMain {
    
    public static void main(String[] args) {

        Product<String, Double> product = new Product<>("apple", 0.50);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        Product<String, Integer> product1 = new Product<>("apple", 100);
        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());



    }
}   
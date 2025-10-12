public class GetSetCar {
    
    private final String model; // final adds extar security against being writeable
    private String color;
    private double price; 

    GetSetCar(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // getter methods:
    String getModel(){
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){ 
        return "$"+this.price; // string works
    }

    // setter methods:
    void setColor(String color){
        this . color = color;
    }
    void setPrice(int price){
        if(price < 0){
            System. out.println("Price can't be less than zero");
        }
        else{
            this. price = price;
        }        
    }



    
}

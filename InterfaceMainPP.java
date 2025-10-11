public class InterfaceMainPP {

    public static void main(String[] args) {
        
        RabbitPP rabbit  = new RabbitPP();
        FishPP fish = new FishPP();
        HawkPP hawk = new HawkPP();

        rabbit.flee();
        fish.flee();
        fish.hunt();
        hawk.hunt();
    }
    
}

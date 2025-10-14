import java.util.HashMap;

public class hashMap {
    public static void main(String args[]){
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("pineapple", 0.100);

        map.put("orange", 1000000.00); // over writes

        System.out.println(map);

        map.remove("apple");
        System.out.println(map);

        System.out.println(map.get("orange"));

        // to check if key/value exists
        System.out.println(map.containsKey("banana")); // is there a key of banana?
        System.out.println(map.containsValue(0.50)); // is there a value of 0.50?
        System.out.println(map.containsValue(0.25)); // is there a value of 0.25?

        //format
        for(String key: map.keySet()){
            System.out.println(key+" : $"+map.get(key));

        }




    }
}

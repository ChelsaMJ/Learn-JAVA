import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String args[]){
        ArrayList<Double> list= new ArrayList<>();

        list. add(3.14);
        list. add(1.99);
        list. add(2.01);

        list.remove(1.99);
        list.set(0, 2.99);

        System. out. println (list) ;
        System. out. println (list.size()) ; // total num of elements

        System. out. println (list.get(1)) ;

        Collections . sort(list) ; // use collections framework to use sort()
        System. out. println (list) ;




    }
}

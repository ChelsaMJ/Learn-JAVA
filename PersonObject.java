public class PersonObject {
    
    String first;
    String last;

    PersonObject(String first, String last){

        this.first =first;
        this.last=last;
    }

    void showName(){
        System.out.println(this.first+" "+this.last);

    }
}

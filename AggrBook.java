public class AggrBook {
    
    String title;
    int pages;

    AggrBook(String title, int pages){
        this.title = title;
        this.pages =pages;
    
    }

    String displaylnfo(){
        return this.title+ "("+ this. pages+ " pages)"  ;
        }
}

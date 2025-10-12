public class AggrLibrary {

    // it contains array of books
    String name;
    int year;
    AggrBook[] books;

    AggrLibrary(String name, int year, AggrBook[] books){
        this.name=name;
        this.year=year;
        this.books=books;

    }

    void displaylnfo(){
        System.out.println(this.year+this.name);

        System.out.println("Books available are:");
        for(AggrBook book: books){
            System.out.println(book.displaylnfo());
        }

    }
    
}

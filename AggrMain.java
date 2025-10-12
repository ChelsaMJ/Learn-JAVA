public class AggrMain {
    
    public static void main(String args[]){


        AggrBook book1 = new AggrBook("Harry Potter and the Sorcerer's Stone", 123);
        AggrBook book2 = new AggrBook("Harry Potter and the Chamber of Secrets", 231);
        AggrBook book3 = new AggrBook("Harry Potter and the Prisoner of Azkaban", 321);


        AggrBook[] books = {book1,book2,book3}; // passed to library

        AggrLibrary library = new AggrLibrary(" NYC Public Library" ,1897, books);

        library.displaylnfo();

        // in aggregation, even if library is deleted, the book info stays inside here:  
        // (since books werent built into the library - a key diff with composition)
            // AggrBook book1 = new AggrBook("Harry Potter and the Sorcerer's Stone", 123);
            // AggrBook book2 = new AggrBook("Harry Potter and the Chamber of Secrets", 231);
            // AggrBook book3 = new AggrBook("Harry Potter and the Prisoner of Azkaban", 321);
        // :this info exists independently outside library
    

    }
}

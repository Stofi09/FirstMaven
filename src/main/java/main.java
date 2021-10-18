import creator.Author;
import creator.Director;
import creator.aCreator;
import enums.BookType;
import enums.MovieType;
import item.*;
import library.Library;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        aCreator JoshuaB = new Author("Joshua Block");
        aCreator DanA = new Author("Dan Abnett");

        // init Directors
        aCreator MichaelB = new Director("Michael Bay");
        aCreator EricD = new Director("Eric Darnell");


        // init Books
        aBook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE);
        EBook EffectiveJavaEBook = new EBook(134685997 ,"Effective Java Ebook", (Author) JoshuaB, BookType.SCIENCE,"url");
        aBook Saturnine = new Book (123,"Saturnine", (Author) DanA, BookType.FICTION);

        //init Movies
        Movie PearlHarbour = new Movie("Pearl Harbour", MovieType.BIOGRAPHY,(Director) MichaelB);
        Movie Armageddon = new Movie("Armageddon", MovieType.FICTION,(Director) MichaelB);
        MovieForKids Madagascar =  new MovieForKids("Madagascar", MovieType.CARTOON,(Director) EricD);

        //Add book to books
        ((Author) JoshuaB).addBook(EffectiveJava);
        ((Director) MichaelB).addMovie(PearlHarbour);
        ((Director) MichaelB).addMovie(Armageddon);
        ((Director) EricD).addMovie(Madagascar);

        // init libraries
        Library EdinburghLibrary = new Library("Edinburgh","address");
        Library GlasgowLibrary = new Library("Glasgow","address");

        // Add books to the library
        EdinburghLibrary.addBook(EffectiveJava);
        EdinburghLibrary.addEBook(EffectiveJavaEBook);

        GlasgowLibrary.addBook(EffectiveJava);
        GlasgowLibrary.addEBook(EffectiveJavaEBook);

        // Add movies to the library
        EdinburghLibrary.addMovie(PearlHarbour);
        EdinburghLibrary.addMovie(Armageddon);

        GlasgowLibrary.addMovie(PearlHarbour);
        GlasgowLibrary.addMovie(Armageddon);

        // Rent books which are added and available
        EdinburghLibrary.rentBook(EffectiveJava);
        EdinburghLibrary.rentEBook(EffectiveJavaEBook);

        // Rent movies which are added and available
        EdinburghLibrary.rentMovie(PearlHarbour);
        EdinburghLibrary.rentMovie(Armageddon);

        // Try to rent books and movies which are not available or not in the library
        EdinburghLibrary.rentBook(EffectiveJava);
        EdinburghLibrary.rentBook(Saturnine);
        EdinburghLibrary.rentMovie(Madagascar);
        EdinburghLibrary.rentMovie(PearlHarbour);

        List<Library> libraries = new ArrayList<>();
        libraries.add(EdinburghLibrary);
        libraries.add(GlasgowLibrary);
    }

    // Lookingfor books in multiple libraries
    public static void findBook(List<Library> libraries, Book book){
        libraries.stream().forEach(library -> {
            library.rentBook(book);
        });

    }
}

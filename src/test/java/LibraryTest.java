import creator.Author;
import creator.Director;
import creator.ACreator;
import enums.Genre;

import item.*;
import library.Library;


import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {


    @Test
    public void testLibraryName(){
        Library lib = new Library("Name","Address");
        assertEquals( "Name",lib.getName());
    }

    @Test
    public void testLibraryAddress(){
        Library lib = new Library("Name","Address");
        assertEquals( "Address",lib.getAddress());
    }

    @Test
    public void testBookMap(){
        Library lib = new Library("Name","Address");
        ACreator JoshuaB = new Author("Joshua Block");
        Book EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE);
        lib.addBook(EffectiveJava);
        HashMap<String, ABook> books = new HashMap<>();
        books.put(EffectiveJava.getTitle(),EffectiveJava);
        assertEquals(books,lib.getBooks());
    }

    @Test
    public void testEBookMap(){
        Library lib = new Library("Name","Address");
        ACreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new EBook(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE,"url");
        lib.addEBook((EBook) EffectiveJava);
        HashMap<String, EBook> books = new HashMap<>();
        books.put(EffectiveJava.getTitle(), (EBook) EffectiveJava);
        assertEquals(books,lib.getEBooks());
    }

    @Test
    public void testMovieMap(){
        Library lib = new Library("Name","Address");
        ACreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) MichaelB);
        lib.addMovie(PearlHarbour);
        HashMap<String, Movie> movies = new HashMap<>();
        movies.put(PearlHarbour.getTitle(), PearlHarbour);
        assertEquals(movies,lib.getMovies());
    }

    @Test
    public void testMovieForKidsMap(){
        Library lib = new Library("Name","Address");
        ACreator MichaelB = new Director("Michael Bay");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", Genre.CARTOON,(Director) MichaelB);
        lib.addMovieForKids(Madagascar);
        HashMap<String, MovieForKids> movies = new HashMap<>();
        movies.put(Madagascar.getTitle(), Madagascar);
        assertEquals(movies,lib.getMovieForKid());
    }

    @Test
    public void testRentBook(){
        Library lib = new Library("Name","Address");
        ACreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE);
        lib.addBook(EffectiveJava);
        lib.rentBook(EffectiveJava);
        assertEquals(false,lib.getBooks().get(EffectiveJava.getTitle()).getAvailability());
    }

    @Test
    public void testRentBookNull(){
        Library lib = new Library("Name","Address");
        ACreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE);
        lib.rentBook(EffectiveJava);
        assertEquals(null,lib.getBooks().get(EffectiveJava.getTitle()));
    }

    @Test
    public void testRentEBook(){
        Library lib = new Library("Name","Address");
        ACreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new EBook(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE,"url");
        lib.addEBook((EBook) EffectiveJava);lib.addBook(EffectiveJava);
        lib.rentEBook(EffectiveJava);
        assertEquals(false,lib.getEBooks().get(EffectiveJava.getTitle()).getAvailability());
    }

    @Test
    public void testRentEBookNull(){
        Library lib = new Library("Name","Address");
        ACreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new EBook(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE,"url");
        lib.rentEBook(EffectiveJava);
        assertEquals(null,lib.getEBooks().get(EffectiveJava.getTitle()));
    }

    @Test
    public void testRentMovie(){
        Library lib = new Library("Name","Address");
        ACreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) MichaelB);
        lib.addMovie(PearlHarbour);
        lib.rentMovie(PearlHarbour);
        assertEquals(false,lib.getMovies().get(PearlHarbour.getTitle()).getAvailability());
    }

    @Test
    public void testRentMovieNull(){
        Library lib = new Library("Name","Address");
        ACreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) MichaelB);
        lib.rentMovie(PearlHarbour);
        assertEquals(null,lib.getMovies().get(PearlHarbour.getTitle()));
    }

    @Test
    public void testRentMovieForKids(){
        Library lib = new Library("Name","Address");
        ACreator MichaelB = new Director("Michael Bay");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", Genre.CARTOON,(Director) MichaelB);
        lib.addMovieForKids(Madagascar);
        lib.rentMovie(Madagascar);
        assertEquals(false,lib.getMovieForKid().get(Madagascar.getTitle()).getAvailability());
    }

    @Test
    public void testRentMovieForKidsNull(){
        Library lib = new Library("Name","Address");
        ACreator MichaelB = new Director("Michael Bay");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", Genre.CARTOON,(Director) MichaelB);
        lib.rentMovie(Madagascar);
        assertEquals(null,lib.getMovieForKid().get(Madagascar.getTitle()));
    }

    @Test
    public void testToString(){
        Library lib = new Library("Name","Address");
        assertEquals(lib.toString(),lib.toString());
    }


}

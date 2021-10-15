import creator.Author;
import creator.Director;
import creator.aCreator;
import enums.BookType;
import enums.MovieType;

import item.*;
import library.Library;
import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class LibraryTest {


    @Test
    public void testLibraryName(){
        Library lib = new Library("Name","Address");
        assertEquals("That is not the right name", "Name",lib.getName());
    }

    @Test
    public void testLibraryAddress(){
        Library lib = new Library("Name","Address");
        assertEquals("That is not right", "Address",lib.getAddress());
    }

    @Test
    public void testBookMap(){
        Library lib = new Library("Name","Address");
        aCreator JoshuaB = new Author("Joshua Block");
        Book EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE);
        lib.addBook(EffectiveJava);
        HashMap<String, aBook> books = new HashMap<>();
        books.put(EffectiveJava.getTitle(),EffectiveJava);
        assertEquals("Something wrong with the map",books,lib.getBooks());
    }

    @Test
    public void testEBookMap(){
        Library lib = new Library("Name","Address");
        aCreator JoshuaB = new Author("Joshua Block");
        aBook EffectiveJava = new EBook(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE,"url");
        lib.addEBook((EBook) EffectiveJava);
        HashMap<String, EBook> books = new HashMap<>();
        books.put(EffectiveJava.getTitle(), (EBook) EffectiveJava);
        assertEquals("Something wrong with the map",books,lib.getEBooks());
    }

    @Test
    public void testMovieMap(){
        Library lib = new Library("Name","Address");
        aCreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", MovieType.BIOGRAPHY,(Director) MichaelB);
        lib.addMovie(PearlHarbour);
        HashMap<String, Movie> movies = new HashMap<>();
        movies.put(PearlHarbour.getTitle(), PearlHarbour);
        assertEquals("Something wrong with the map",movies,lib.getMovies());
    }

    @Test
    public void testMovieForKidsMap(){
        Library lib = new Library("Name","Address");
        aCreator MichaelB = new Director("Michael Bay");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", MovieType.CARTOON,(Director) MichaelB);
        lib.addMovieForKids(Madagascar);
        HashMap<String, MovieForKids> movies = new HashMap<>();
        movies.put(Madagascar.getTitle(), Madagascar);
        assertEquals("Something wrong with the map",movies,lib.getMovieForKid());
    }

    @Test
    public void testRentBook(){
        Library lib = new Library("Name","Address");
        aCreator JoshuaB = new Author("Joshua Block");
        aBook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE);
        lib.addBook(EffectiveJava);
        lib.rentBook(EffectiveJava);
        assertEquals("Not been rented",lib.getBooks().get(EffectiveJava.getTitle()).getAvailability(),false);
    }
    @Test
    public void testRentEBook(){
        Library lib = new Library("Name","Address");
        aCreator JoshuaB = new Author("Joshua Block");
        aBook EffectiveJava = new EBook(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE,"url");
        lib.addEBook((EBook) EffectiveJava);lib.addBook(EffectiveJava);
        lib.rentEBook(EffectiveJava);
        assertEquals("Not been rented",lib.getEBooks().get(EffectiveJava.getTitle()).getAvailability(),false);
    }

    @Test
    public void testRentMovie(){
        Library lib = new Library("Name","Address");
        aCreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", MovieType.BIOGRAPHY,(Director) MichaelB);
        lib.addMovie(PearlHarbour);
        lib.rentMovie(PearlHarbour);
        assertEquals("Not been rented",lib.getMovies().get(PearlHarbour.getTitle()).getAvailability(),false);
    }

    @Test
    public void testRentMovieForKids(){
        Library lib = new Library("Name","Address");
        aCreator MichaelB = new Director("Michael Bay");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", MovieType.CARTOON,(Director) MichaelB);
        lib.addMovieForKids(Madagascar);
        lib.rentMovie(Madagascar);
        assertEquals("Not been rented",lib.getMovieForKid().get(Madagascar.getTitle()).getAvailability(),false);
    }



}
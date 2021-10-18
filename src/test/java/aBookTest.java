import creator.Author;
import creator.ACreator;
import enums.Genre;
import item.Book;
import item.ABook;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class aBookTest {

    @Test
    public void testABookISBN(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book(123,"Saturnine", (Author) DanA, Genre.FICTION);
        assertEquals("Something wrong with ISBN",123,Saturnine.getISBN());
    }

    @Test
    public void testABookTitle(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        assertEquals("Something wrong with title","Saturnine",Saturnine.getTitle());
    }

    @Test
    public void testABookAuthors(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        List<Author> authors = new ArrayList<>();
        authors.add((Author) DanA);
        assertEquals("Something wrong with authors",authors,Saturnine.getAuthors());
    }

    @Test
    public void testABookType(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        assertEquals("Something wrong with authors", Genre.FICTION,Saturnine.getType());
    }

    @Test
    public void testABookBorrow(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        Saturnine.borrowItem();
        assertEquals("Not borrowed",false,Saturnine.getAvailability());
    }

    @Test
    public void testABookSetAvailable(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        Saturnine.borrowItem();
        Saturnine.setAvailable();
        assertEquals("Not available",true,Saturnine.getAvailability());
    }

    @Test
    public void testABookTime(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        Saturnine.borrowItem();
        assertEquals("Not borrowed",Saturnine.getTime(), LocalDate.now());
    }
}

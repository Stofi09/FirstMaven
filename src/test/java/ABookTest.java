import creator.Author;
import creator.ACreator;
import enums.Genre;
import item.Book;
import item.ABook;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ABookTest {

    @Test
    public void testABookISBN(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book(123,"Saturnine", (Author) DanA, Genre.FICTION);
        assertEquals(123,Saturnine.getISBN());
    }

    @Test
    public void testABookTitle(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        assertEquals("Saturnine",Saturnine.getTitle());
    }

    @Test
    public void testABookAuthors(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        List<Author> authors = new ArrayList<>();
        authors.add((Author) DanA);
        assertEquals(authors,Saturnine.getAuthors());
    }

    @Test
    public void testABookType(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        assertEquals( Genre.FICTION,Saturnine.getType());
    }

    @Test
    public void testABookBorrow(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        Saturnine.borrowItem();
        assertEquals(false,Saturnine.getAvailability());
    }

    @Test
    public void testABookSetAvailable(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        Saturnine.borrowItem();
        Saturnine.setAvailable();
        assertEquals(true,Saturnine.getAvailability());
    }

    @Test
    public void testABookTime(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book (123,"Saturnine", (Author) DanA, Genre.FICTION);
        Saturnine.borrowItem();
        assertEquals(Saturnine.getTime(), LocalDate.now());
    }
}

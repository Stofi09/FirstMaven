import creator.Author;
import creator.aCreator;
import enums.Genre;
import item.Book;
import item.ABook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class AuthorTest {

    @Test
    public void testAuthorName(){
        aCreator JoshuaB = new Author("Joshua Block");
        assertEquals("The name was wrong","Joshua Block",JoshuaB.getName());
    }

    @Test
    public void testDirectorBooks(){
        aCreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE);
        ((Author) JoshuaB).addBook(EffectiveJava);
        List<ABook> books = new ArrayList<>();
        books.add(EffectiveJava);
        assertEquals("The movie was wrong",books,((Author) JoshuaB).getBooks());
    }

}

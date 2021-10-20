import creator.Author;
import creator.ACreator;
import enums.Genre;
import item.Book;
import item.ABook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class AuthorTest {

    @Test
    public void testAuthorName(){
        ACreator JoshuaB = new Author("Joshua Block");
        System.out.println("asd");
        assertEquals("Joshua Block",JoshuaB.getName(),"Not the right name");
    }

    @Test
    public void testDirectorBooks(){
        ACreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE);
        ((Author) JoshuaB).addBook(EffectiveJava);
        List<ABook> books = new ArrayList<>();
        books.add(EffectiveJava);
        assertEquals(books,((Author) JoshuaB).getBooks(),"Not in the list");
    }

}

import creator.Author;
import creator.aCreator;
import enums.BookType;
import item.Book;
import item.aBook;
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
        aBook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, BookType.SCIENCE);
        ((Author) JoshuaB).addBook(EffectiveJava);
        List<aBook> books = new ArrayList<>();
        books.add(EffectiveJava);
        assertEquals("The movie was wrong",books,((Author) JoshuaB).getBooks());
    }

}

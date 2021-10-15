import creator.Author;
import creator.aCreator;
import enums.BookType;
import item.EBook;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class EBookTest {

    @Test
    public void testEBookLink(){
        aCreator JoshuaB = new Author("Joshua Block");
        EBook EffectiveJavaEBook = new EBook(134685997 ,"Effective Java Ebook", (Author) JoshuaB, BookType.SCIENCE,"url");
        assertEquals("No link", "url",EffectiveJavaEBook.getLink());
    }
    @Test
    public void testEBookAuthor(){
        aCreator JoshuaB = new Author("Joshua Block");
        EBook EffectiveJavaEBook = new EBook(134685997 ,"Effective Java Ebook", (Author) JoshuaB, BookType.SCIENCE,"url");
        List<Author>authors = new ArrayList<>();
        authors.add((Author) JoshuaB);
        assertEquals("No author", authors,EffectiveJavaEBook.getAuthors());
    }

}

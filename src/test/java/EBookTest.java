import creator.Author;
import creator.ACreator;
import enums.Genre;
import item.EBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;


public class EBookTest {

    @Test
    public void testEBookLink(){
        ACreator JoshuaB = new Author("Joshua Block");
        EBook EffectiveJavaEBook = new EBook(134685997 ,"Effective Java Ebook", (Author) JoshuaB, Genre.SCIENCE,"url");
        assertEquals( "url",EffectiveJavaEBook.getLink());
    }
    @Test
    public void testEBookAuthor(){
        ACreator JoshuaB = new Author("Joshua Block");
        EBook EffectiveJavaEBook = new EBook(134685997 ,"Effective Java Ebook", (Author) JoshuaB, Genre.SCIENCE,"url");
        List<Author>authors = new ArrayList<>();
        authors.add((Author) JoshuaB);
        assertEquals( authors,EffectiveJavaEBook.getAuthors());
    }

}

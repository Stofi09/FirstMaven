import creator.Author;
import creator.ACreator;
import enums.Genre;
import item.BookForKids;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BookForKidsTest {

    @Test
    public void testBookLink(){
        ACreator JoshuaB = new Author("Joshua Block");
        BookForKids EffectiveJavaEBook = new BookForKids(134685997 ,"Effective Java Ebook", (Author) JoshuaB, Genre.SCIENCE);
        assertEquals("No link", 134685997,EffectiveJavaEBook.getISBN());
    }
}

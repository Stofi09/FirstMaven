import creator.Author;
import creator.aCreator;
import enums.BookType;
import item.BookForKids;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BookForKidstest {

    @Test
    public void testBookLink(){
        aCreator JoshuaB = new Author("Joshua Block");
        BookForKids EffectiveJavaEBook = new BookForKids(134685997 ,"Effective Java Ebook", (Author) JoshuaB, BookType.SCIENCE);
        assertEquals("No link", 134685997,EffectiveJavaEBook.getISBN());
    }
}

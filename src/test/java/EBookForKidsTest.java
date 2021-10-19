import creator.Author;
import creator.ACreator;
import enums.Genre;
import item.EBookForKids;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class EBookForKidsTest {

    @Test
    public void testEBookLink(){
        ACreator JoshuaB = new Author("Joshua Block");
        EBookForKids EffectiveJavaEBook = new EBookForKids(134685997 ,"Effective Java Ebook", (Author) JoshuaB, Genre.SCIENCE,"url");
        assertEquals( "url",EffectiveJavaEBook.getLink());
    }
}

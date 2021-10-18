import creator.Author;
import creator.aCreator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class aCreatorTest {

    @Test
    public void getNameTest(){
        aCreator creator = new aCreator("The creator") {
        };
        assertEquals("That is not the same name","The creator",creator.getName() );
    }
}

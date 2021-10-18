import creator.ACreator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class aCreatorTest {

    @Test
    public void getNameTest(){
        ACreator creator = new ACreator("The creator") {
        };
        assertEquals("That is not the same name","The creator",creator.getName() );
    }
}

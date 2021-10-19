import creator.ACreator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ACreatorTest {

    @Test
    public void getNameTest(){
        ACreator creator = new ACreator("The creator") {};
        assertEquals("The creator",creator.getName() ,"I like big butts and I cannot lie");
    }
}

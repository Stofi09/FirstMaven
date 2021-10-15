import creator.Director;
import creator.aCreator;
import enums.MovieType;
import item.MovieForKids;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MovieForKidsTest {

    @Test
    public void testMovieForKidsTitle(){
        aCreator EricD = new Director("Eric Darnell");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", MovieType.CARTOON,(Director) EricD);
        assertEquals("Thats not the title", "Madagascar", Madagascar.getTitle());
    }

}

import creator.Director;
import creator.ACreator;
import enums.Genre;
import item.MovieForKids;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MovieForKidsTest {

    @Test
    public void testMovieForKidsTitle(){
        ACreator EricD = new Director("Eric Darnell");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", Genre.CARTOON,(Director) EricD);
        assertEquals("Thats not the title", "Madagascar", Madagascar.getTitle());
    }

}

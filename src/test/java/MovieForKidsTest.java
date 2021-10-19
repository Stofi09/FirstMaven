import creator.Director;
import creator.ACreator;
import enums.Genre;
import item.MovieForKids;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MovieForKidsTest {

    @Test
    public void testMovieForKidsTitle(){
        ACreator EricD = new Director("Eric Darnell");
        MovieForKids Madagascar =  new MovieForKids("Madagascar", Genre.CARTOON,(Director) EricD);
        assertEquals( "Madagascar", Madagascar.getTitle(),"Not the right title");
    }

}

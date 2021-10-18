import creator.Director;
import creator.aCreator;
import enums.Genre;
import item.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class MovieTest {

    @Test
    public void testMovieDirectors(){
        aCreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) MichaelB);
        List<Director> dir = new ArrayList<>();
        dir.add((Director) MichaelB);
        assertEquals("not the right dir", dir,PearlHarbour.getDirectors());
    }

    @Test
    public void testMovieDirectorsAdd(){
        aCreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) MichaelB);
        List<Director> dir = new ArrayList<>();
        dir.add((Director) MichaelB);
        aCreator MichaelC = new Director("Michael Bay");
        PearlHarbour.addDirector((Director) MichaelC);
        dir.add((Director) MichaelC);
        assertEquals("not the right dir", dir,PearlHarbour.getDirectors());
    }
}

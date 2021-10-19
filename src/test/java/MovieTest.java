import creator.Director;
import creator.ACreator;
import enums.Genre;
import item.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class MovieTest {

    @Test
    public void testMovieDirectors(){
        ACreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) MichaelB);
        List<Director> dir = new ArrayList<>();
        dir.add((Director) MichaelB);
        assertEquals( dir,PearlHarbour.getDirectors(), "not the right director");
    }

    @Test
    public void testMovieDirectorsAdd(){
        ACreator MichaelB = new Director("Michael Bay");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) MichaelB);
        List<Director> dir = new ArrayList<>();
        dir.add((Director) MichaelB);
        ACreator MichaelC = new Director("Michael Bay");
        PearlHarbour.addDirector((Director) MichaelC);
        dir.add((Director) MichaelC);
        assertEquals( dir,PearlHarbour.getDirectors(), "Director coudlnt be added");
    }
}

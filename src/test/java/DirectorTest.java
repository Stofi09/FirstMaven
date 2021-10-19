import creator.Director;

import enums.Genre;
import item.Movie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class DirectorTest {

    @Test
    public void testDirectorName(){
        Director dir = new Director("Ben");
        assertEquals("Ben",dir.getName(),"That is not the right name");
    }

    @Test
    public void testDirectorMovies(){
        Director dir = new Director("Ben");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) dir);
        dir.addMovie(PearlHarbour);
        List<Movie> movies = new ArrayList<>();
        movies.add(PearlHarbour);
        assertEquals(movies,dir.getMovies(),"Not in the list");
    }



}

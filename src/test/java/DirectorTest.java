import creator.Director;

import enums.Genre;
import item.Movie;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class DirectorTest {

    @Test
    public void testDirectorName(){
        Director dir = new Director("Ben");
        assertEquals("The name was wrong","Ben",dir.getName());
    }

    @Test
    public void testDirectorMovies(){
        Director dir = new Director("Ben");
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) dir);
        dir.addMovie(PearlHarbour);
        List<Movie> movies = new ArrayList<>();
        movies.add(PearlHarbour);
        assertEquals("The movie was wrong",movies,dir.getMovies());
    }



}

package item;

import creator.Director;
import enums.Genre;

public class MovieForKids extends Movie implements AgeAppropriate {

    public MovieForKids(String title, Enum<Genre> type, Director director) {
        super(title, type, director);
    }

}

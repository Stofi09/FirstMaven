package item;

import creator.Director;

public class MovieForKids extends Movie implements AgeAppropriate {

    public MovieForKids(String title, Enum type, Director director) {
        super(title, type, director);
    }

}

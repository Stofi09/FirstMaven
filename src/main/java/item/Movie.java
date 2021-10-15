package item;

import creator.Director;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Item {

    private List<Director> directors;

    public Movie(String title, Enum type,Director director) {
        this.title = title;
        this.type = type;
        this.directors = new ArrayList<>();
        this.directors.add(director);
    }

    public void addDirector(Director director){
        this.directors.add(director);
    }
    public List<Director> getDirectors(){
        return this.directors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", timeTakenOut=" + timeTakenOut +
                ", isAvailable=" + isAvailable +
                ", directors=" + directors +
                '}';
    }
}

package creator;

import item.Movie;

import java.util.ArrayList;
import java.util.List;

public  class Director extends aCreator{

    private  String name;
    private List<Movie> movies;

    public Director(String name){
        this.name = name;
        this.movies = new ArrayList<>();
    };

    public void addMovie(Movie movie){
            this.movies.add(movie);
    }

    public List<Movie> getMovies(){
        return this.movies;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", movies=" + movies.size() +
                '}';
    }
}

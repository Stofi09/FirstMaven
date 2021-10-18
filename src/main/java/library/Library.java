package library;

import item.*;

import java.util.HashMap;
import java.util.Map;

public  class Library {

    protected String name;
    protected String address;



    private HashMap<String, aBook> booksByTitle;
    private HashMap<String, Movie> moviesByTitle;
    private HashMap<String, EBook> eBooksByTitle;
    private HashMap<String, MovieForKids> movieForKidsByTitle;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
        initMaps();
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    private void initMaps(){
        this.booksByTitle = new HashMap<>();
        this.eBooksByTitle = new HashMap<>();
        this.moviesByTitle = new HashMap<>();
        this.movieForKidsByTitle = new HashMap<>();
    }

    public void addBook(aBook book) {
        this.booksByTitle.put(book.getTitle(),book);
    }
    public void addEBook(EBook book){
        this.eBooksByTitle.put(book.getTitle(),book);
    }
    public void addMovie(Movie movie){
        this.moviesByTitle.put(movie.getTitle(),movie);
    }
    public void addMovieForKids(MovieForKids movie){
        this.movieForKidsByTitle.put(movie.getTitle(),movie);
    }

    public Map<String,aBook> getBooks() {
        return this.booksByTitle;
    }
    public Map<String,EBook> getEBooks() {
        return this.eBooksByTitle;
    }
    public Map<String,Movie> getMovies() {
        return this.moviesByTitle;
    }
    public Map<String, MovieForKids> getMovieForKid(){return this.movieForKidsByTitle;}

    /*How to reuse the check/ rent methods? .getClass???*/
    public void rentEBook(aBook book){
        if(checkEBook(book)){
            this.eBooksByTitle.get(book.getTitle()).borrowItem();
            System.out.println("Here is the book: " + book);
        }else{
            System.err.println("We don't have this book: " +book);
        }
    }

    public void rentBook(aBook book){
           if(checkBook(book)){
               if(this.booksByTitle.get(book.getTitle()).getAvailability()){
                   this.booksByTitle.get(book.getTitle()).borrowItem();
                   System.out.println("Here is the book: " + book);
               } else {
                   System.out.println("We have that book, but unfortunately it is not available at the moment.");
               }
           }else {
               System.err.println("We don't have this book: " +book.getTitle());
           }
    }
    public void rentMovie(Movie movie){
        if(checkMovie(movie)){
            this.moviesByTitle.get(movie.getTitle()).borrowItem();
            System.out.println("Here is the movie: " + movie);
        }else{
            System.err.println("We don't have this movie: " +movie.getTitle());
        }
    }

    public void rentMovie(MovieForKids movie){
        if(checkMovie(movie)){
            this.movieForKidsByTitle.get(movie.getTitle()).borrowItem();
            System.out.println("Here is the kid movie: " + movie);
        }else{
            System.err.println("We don't have this kid book: " +movie.getTitle());
        }
    }


    private boolean checkEBook(aBook book){
        return this.eBooksByTitle.containsKey(book.getTitle());
    }

    private boolean checkBook(aBook book){
        return (this.booksByTitle.containsKey(book.getTitle()));
    }
   private boolean checkMovie(Movie movie){
       return (this.moviesByTitle.containsKey(movie.getTitle()));
   }
    private boolean checkMovie(MovieForKids movie){
        return (this.movieForKidsByTitle.containsKey(movie.getTitle()));
    }

    @Override
    public String toString() {
        return "aLibrary{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", booksByTitle=" + booksByTitle +
                ", moviesByTitle=" + moviesByTitle +
                ", eBooksByTitle=" + eBooksByTitle +
                '}';
    }
}

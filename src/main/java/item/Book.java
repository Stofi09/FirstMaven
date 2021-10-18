package item;

import creator.Author;
import enums.Genre;

public class Book extends ABook {


    public Book(long ISBN, String title, Author author, Enum<Genre> type) {
        super(ISBN, title, author, type);
    }
}

package item;

import creator.Author;
import enums.Genre;

public class BookForKids extends ABook implements AgeAppropriate{
    public BookForKids(long ISBN, String title, Author author, Enum<Genre> type) {
        super(ISBN, title, author, type);
    }

}

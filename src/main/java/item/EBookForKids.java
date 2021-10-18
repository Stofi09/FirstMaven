package item;

import creator.Author;
import enums.Genre;

public class EBookForKids extends EBook implements AgeAppropriate{


    public EBookForKids(long ISBN, String title, Author author, Enum<Genre> type, String link) {
        super(ISBN, title, author, type, link);
    }

}

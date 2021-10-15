package item;

import creator.Author;

public class EBookForKids extends EBook implements AgeAppropriate{


    public EBookForKids(long ISBN, String title, Author author, Enum type, String link) {
        super(ISBN, title, author, type, link);
    }

}

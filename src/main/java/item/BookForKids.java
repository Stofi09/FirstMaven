package item;

import creator.Author;

public class BookForKids extends aBook implements AgeAppropriate{
    public BookForKids(long ISBN, String title, Author author, Enum type) {
        super(ISBN, title, author, type);
    }

}
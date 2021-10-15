package item;

import creator.Author;

public class Book extends aBook{


    public Book(long ISBN, String title, Author author, Enum type) {
        super(ISBN, title, author, type);
    }
}

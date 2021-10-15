package item;

import creator.Author;

public class EBook extends aBook{

    private String link;

    public EBook(long ISBN, String title, Author author, Enum type, String link) {
        super(ISBN, title, author, type);
        this.link = link;
    }


    public String getLink() {
        return link;
    }
}

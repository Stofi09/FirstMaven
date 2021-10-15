package item;

import creator.Author;

import java.util.ArrayList;
import java.util.List;

public abstract class aBook extends Item {

    protected long ISBN;
    protected List<Author> authors;



    protected aBook(long ISBN, String title, Author author,Enum type){
        super();
        this.ISBN = ISBN;
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(author);
        this.type = type;
        this.isAvailable = true;
    }

    public long getISBN() {
        return ISBN;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "aBook{" +
                "title='" + title + '\'' +
                ", type=" + type +
                ", timeTakenOut=" + timeTakenOut +
                ", isAvailable=" + isAvailable +
                ", ISBN=" + ISBN +
                ", authors=" + authors +
                '}';
    }
}

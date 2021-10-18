package creator;

import item.ABook;

import java.util.ArrayList;
import java.util.List;


public class Author extends ACreator {

    private  String name;
    private List<ABook> books;

    public Author(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    @Override
    public String getName(){
        return this.name;
    }

    public void addBook(ABook book){
        books.add(book);
    }

    public List<ABook> getBooks(){
        return this.books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ",and has books=" + books.size() +
                '}';
    }
}

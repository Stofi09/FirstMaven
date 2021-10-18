
import creator.Author;
import creator.aCreator;
import customer.Customer;
import enums.BookType;
import enums.CustomerAgeType;
import item.Book;
import item.aBook;
import library.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CustomerTest {

    @Test
    public void testName() {
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals("That is not the name", "Name", cus.getName());
    }


    @Test
    public void testType() {
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals("That is not the type", CustomerAgeType.ADULT, cus.getAgeType());
    }


    @Test
    public void testItemsAdd() {
        aCreator DanA = new Author("Dan Abnett");
        aBook Saturnine = new Book(123,"Saturnine", (Author) DanA, BookType.FICTION);
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addItem(Saturnine);
        System.out.println(cus.toString());
        assertEquals("That is not the book", true, cus.getItems().contains(Saturnine));
    }

    @Test
    public void testLibraryAdd(){
        Library lib = new Library("name","address");
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addLibrary(lib);
        assertEquals("Thats not a lib", true, cus.getLibraries().contains(lib));
    }

    @Test
    public void testRemoveItemTrue(){
        aCreator DanA = new Author("Dan Abnett");
        aBook Saturnine = new Book(123,"Saturnine", (Author) DanA, BookType.FICTION);
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addItem(Saturnine);
        assertEquals("Not in the list", true, cus.removeItem(Saturnine));
    }

    @Test
    public void testRemoveItemFalse(){
        aCreator DanA = new Author("Dan Abnett");
        aBook Saturnine = new Book(123,"Saturnine", (Author) DanA, BookType.FICTION);
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals("Not in the list", false, cus.removeItem(Saturnine));
    }

    @Test
    public void testRemoveLibraryTrue(){
        Library lib = new Library("name","address");
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addLibrary(lib);
        assertEquals("Not in the list", true, cus.removeLibrary(lib));
    }

    @Test
    public void testRemoveLibraryFalse(){
        Library lib = new Library("name","address");
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals("Not in the list", false, cus.removeLibrary(lib));
    }
}
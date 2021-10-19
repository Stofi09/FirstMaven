
import creator.Author;
import creator.ACreator;
import customer.Customer;
import enums.Genre;
import enums.CustomerAgeType;
import item.Book;
import item.ABook;
import library.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CustomerTest {

    @Test
    public void testName() {
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals( "Name", cus.getName());
    }

    @Test
    public void testType() {
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals(CustomerAgeType.ADULT, cus.getAgeType());
    }

    @Test
    public void testItemsAdd() {
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book(123,"Saturnine", (Author) DanA, Genre.FICTION);
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addItem(Saturnine);
        System.out.println(cus.toString());
        assertEquals( true, cus.getItems().contains(Saturnine));
    }

    @Test
    public void testLibraryAdd(){
        Library lib = new Library("name","address");
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addLibrary(lib);
        assertEquals( true, cus.getLibraries().contains(lib));
    }

    @Test
    public void testRemoveItemTrue(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book(123,"Saturnine", (Author) DanA, Genre.FICTION);
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addItem(Saturnine);
        assertEquals( true, cus.removeItem(Saturnine));
    }

    @Test
    public void testRemoveItemFalse(){
        ACreator DanA = new Author("Dan Abnett");
        ABook Saturnine = new Book(123,"Saturnine", (Author) DanA, Genre.FICTION);
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals(false, cus.removeItem(Saturnine));
    }

    @Test
    public void testRemoveLibraryTrue(){
        Library lib = new Library("name","address");
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        cus.addLibrary(lib);
        assertEquals(true, cus.removeLibrary(lib));
    }

    @Test
    public void testRemoveLibraryFalse(){
        Library lib = new Library("name","address");
        Customer cus = new Customer("Name", CustomerAgeType.ADULT);
        assertEquals( false, cus.removeLibrary(lib));
    }
}
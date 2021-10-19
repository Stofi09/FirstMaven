import creator.ACreator;
import creator.Author;
import enums.Genre;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import item.ABook;
import item.Book;
import library.Library;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberLibraryTest {


    public String book= "";
    public String answer = "";
    @Given("I would like to rent {string}")
    public void i_would_like_to_rent(String book){
        this.book = book;
    }
    @When("I ask the librarian")
    public void i_ask_the_librarian(){
        Library lib = new Library("Name","Address");
        ACreator JoshuaB = new Author("Joshua Block");
        ABook EffectiveJava = new Book(134685997 ,"Effective Java", (Author) JoshuaB, Genre.SCIENCE);
        lib.addBook(EffectiveJava);

        if (lib.getBooks().containsKey(this.book)){
            this.answer = "Yeppers";
        }else {
            this.answer = "Nope";
        }
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String answer){
        assertEquals(answer,this.answer);
    }

}

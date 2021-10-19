import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CucumberTest {


    public Library library;
    public String result = "";
    public Library library2;
    public String result2 = "";
    @Given(": My library is called {string}")
    public void my_library_is_called(String string) {
       library = new Library(string,"address");
    }

    @When(": When somebody asks {string} is my library")
    public void when_somebody_asks_is_my_library(String string) {
        if (string.equalsIgnoreCase(library.getName())){
            result = "Yes";
        }
    }
    @Then(": I should say {string}")
    public void i_should_say(String string) {
      assertEquals(string,result);
    }


    @Given(": My library is in {string}")
    public void my_library_is_in(String string){
        library2 = new Library("name",string);
    }
    @When(": somebody asks whether my library is in {string}")
    public void somebody_asks_whether_my_library_is_in(String string){
        if (string.equalsIgnoreCase(library2.getAddress())){
            result2 = "Yes";
        }
    }

    @Then(": I should say to him {string}")
    public void i_should_say_to_him(String string){
        assertEquals(string,result2);
    }
}

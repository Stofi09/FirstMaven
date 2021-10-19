import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.Library;

import static org.junit.Assert.assertEquals;
public class CucumberTest {


    public Library library;
    public String result;


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
}

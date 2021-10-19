import creator.Director;
import enums.Genre;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import item.Movie;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberDirector {

    public Director dir;
    public String result="";
    @Given("The director's name is {string}")
    public void the_director_s_name_is(String string) {
       dir = new Director(string);
    }
    @When("I check the name in the list")
    public void i_check_the_name_in_the_list() {
        Movie PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) dir);
        if( PearlHarbour.getDirectors().contains(dir)){
            result = "true";
        }
        else {
            result = "false";
        }
    }
    @Then("It should return a {string}")
    public void it_should_return_a(String string) {
     assertEquals(result,string);
    }
}

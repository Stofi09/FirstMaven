import creator.Director;
import enums.Genre;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import item.Movie;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberMovie {

    public Director dir;
    Movie PearlHarbour ;
    public String result="";
    public String type = "";
    public String result2 = "";
    @Given("The director's name is {string}")
    public void the_director_s_name_is(String string) {
       dir = new Director(string);
    }
    @When("I check the name in the list")
    public void i_check_the_name_in_the_list() {
        PearlHarbour = new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) dir);
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

    @Given("The genre of the movie is {string}")
    public void the_genre_of_the_movie_is(String string) {
        dir = new Director("dir");
        this.type = string;
        PearlHarbour =  new Movie("Pearl Harbour", Genre.BIOGRAPHY,(Director) dir);
    }
    @When("I check the  genre type")
    public void i_check_the_genre_type() {
        if(PearlHarbour.getType().name().equalsIgnoreCase(this.type)){
            this.result2 = "Yeppers";
        } else {
          this.result2 = "Nope";
        }
    }
    @Then("It should return an {string}")
    public void it_should_return_an(String string) {
       assertEquals(string,this.result2);
    }

}

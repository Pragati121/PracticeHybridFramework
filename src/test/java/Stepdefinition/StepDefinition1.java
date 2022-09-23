package Stepdefinition;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class StepDefinition1 extends BaseClass {

    @Given("User is on Home Page")
    public void user_is_on_home_page() throws IOException, InterruptedException {
        setUpDriver();
        pageFactory.getHome().HomeUser();
        pageFactory.getComputer().ComputerUser();
       // close();
    }
    @When("Add Notebooks to cart")
    public void add_notebooks_to_cart() {
        pageFactory.getCheck().checkout();

   }
//    @When("Checkout and register")
//    public void checkout_and_register() {
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("Verify the product")
//    public void verify_the_product() {
//        throw new io.cucumber.java.PendingException();
//    }
}

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class TestSteps extends PageObjects
{
    @Given("^sample feature file is ready$")
    public void givenStatement() {
        System.out.println("Given statement executed successfully!");
        PageObjects.PageMethods();
    }

    @When("^I run the feature file$")
    public void whenStatement(){
        System.out.println("When statement executed successfully");
    }

    @Then("^run should be successful$")
    public void thenStatement(){
        System.out.println("Then statement executed successfully");
    }


    @Given("^Calculator code is setup$")
    public void givenCalculatorStatement() {
        System.out.println("Given statement executed successfully!");
        PageObjects.CalculatorMethods(100,200);
    }

    @When("^I enter two numbers$")
    public void whenCalculatorStatement(){
        System.out.println("When statement executed successfully");
    }

    @Then("^result should be the addition of those numbers$")
    public void thenCalculatorStatement(){
        System.out.println("Then statement executed successfully");
    }

}

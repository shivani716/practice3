package stepDefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionSteps {
	
	int a,b,sum;
	@Given("I have two numbers as {string} & {string}")
	public void i_have_two_numbers_as(String num1, String num2) {
		a=Integer.parseInt(num1);
		b=Integer.parseInt(num2);
	}


	

	@When("do the Addition")
	public void do_the_addition() {
		sum=a+b;
	}
	@Then("Result should display in the console")
	public void result_should_display_in_the_console() {
		System.out.println("Addition is :: "+(a+b));
	  
	}







}

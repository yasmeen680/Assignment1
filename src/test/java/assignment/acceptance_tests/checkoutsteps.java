package assignment.acceptance_tests;

import static org.junit.Assert.assertEquals;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;

import assignment.checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class checkoutsteps {
	
	 checkout checkout=new checkout();
	int bananaPrice = 0, applePrice = 0;
	
		@Given("the price of a {string} is {int}")
		public void the_Price_Of_A_is(String item,int price) {
		    // Write code here that turns the phrase above into concrete actions
			if (item.equals("banana")) 
			{bananaPrice = price;}
			else
			{applePrice = price;}
			
		  //  throw new io.cucumber.java.PendingException();
		}

		@When("I checkout {int} {string}")
		public void iCheckout(int itemcount, String string) {
			if (string.equals("banana"))
		{checkout.add(itemcount, bananaPrice);}
		else 
		  {checkout.add(itemcount, applePrice);}
		}
		
		@Then("the total price should be {int}")
		public void the_total_price_should_be(int price) 
		{
			assertEquals(price, checkout.total());
			//assertEquals(price.intValue(),checkout.total());
			//throw new io.cucumber.java.PendingException();
		}

}

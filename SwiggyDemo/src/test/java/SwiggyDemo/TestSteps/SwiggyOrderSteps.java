package SwiggyDemo.TestSteps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import SwiggyDemo.Pages.SwiggyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggyOrderSteps extends Driver {
	
	@Given("a user in the swiggy homepage")
	public void a_user_in_the_swiggy_homepage() {
		assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
		
	    
	}

	@When("Type your delivery location as ‘Hyderabad’ and select the first option from the auto-complete box.")
	public void type_your_delivery_location_as_hyderabad_and_select_the_first_option_from_the_auto_complete_box() {
		swiggyPage.searchProduct("Hyderabad");
	}

	@When("Click on the first restaurant shown under ‘Top restaurant chains in Hyderabad’.")
	public void click_on_the_first_restaurant_shown_under_top_restaurant_chains_in_hyderabad() throws InterruptedException {
		swiggyPage.item();
	    
	}

	@When("Click on ‘Add’ button corresponding to first listed dish.")
	public void click_on_add_button_corresponding_to_first_listed_dish() throws InterruptedException {
		swiggyPage.addItem();
	    
	}

	@When("Hover over ‘Cart’ in the top right corner.")
	public void hover_over_cart_in_the_top_right_corner() throws InterruptedException {

		swiggyPage.hoverOverToCart();
	    
	}

	@When("Click on ‘Check Out’ in the sub-menu.")
	public void click_on_check_out_in_the_sub_menu() throws InterruptedException {
		SwiggyPage.checkItem();
	    
	}

	@Then("Verify the text {string} Is visible on the next page sucessfully.")
	public void verify_the_text_is_visible_on_the_next_page_sucessfully(String string)  throws InterruptedException {
	    Thread.sleep(3000);
		String expectedText="To place your order now, log in to your existing account or sign up.";
		String actualText=SwiggyPage.getText();
		Assert.assertEquals(actualText,expectedText);
	}


}

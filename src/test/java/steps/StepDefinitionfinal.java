package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.SetColorPage;

public class StepDefinitionfinal extends BasePage{
	SetColorPage setColorPage;
	
	@Before
	public void beforeRun() {
		init();
		setColorPage = PageFactory.initElements(driver, SetColorPage.class);
		
	}
	
	@Given("^validate SkyBlue Background button is displayed$")
	public void validate_SkyBlue_Background_button_is_displayed()  {
	    setColorPage.checkSkyBlueButtonIsVisible();
	    
	}
	
	@When("^I click on the skyBlue background button$")
	public void i_click_on_the_skyBlue_background_button()  {
	    setColorPage.clickSkyBlueBackground();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
	    //validate the background color is sky Blue
		setColorPage.validateBackgroundIsBlue();
	}
	
	@After
	public void exit() {
		//tearDown();
	}

}

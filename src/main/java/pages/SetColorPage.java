package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetColorPage {

	WebDriver driver;
	String backgroundColor;

	public SetColorPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set SkyBlue Background')]")
	WebElement skyBlueBackground;

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set White Background')]")
	WebElement whiteBackground;
	
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement skyBlueColor;
	
	@FindBy(how = How.TAG_NAME, using = "body") WebElement bodyColor;

	public void checkSkyBlueButtonIsVisible() {

		if (skyBlueBackground.isDisplayed()) {
			System.out.println("sky blue button is Displayed");
		}
		else {
			System.out.println("no such element found");
		}
	}

	public void clickSkyBlueBackground() {
		skyBlueBackground.click();
	}
	
	public boolean validateBackgroundIsBlue() {
		backgroundColor = bodyColor.getAttribute("style");
		System.out.println(backgroundColor);
		if(backgroundColor.equals("background-color: skyblue;")) {
			System.out.println("Background color is changed to blue");
			return true;
		}
		else
			return false;
	}
		
}

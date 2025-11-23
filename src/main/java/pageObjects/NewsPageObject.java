package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class NewsPageObject extends BasePage{
	WebDriver driver;

	public NewsPageObject(WebDriver driver) {
		this.driver = driver;
	}


}

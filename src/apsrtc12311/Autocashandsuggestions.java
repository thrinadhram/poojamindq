package apsrtc12311;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Autocashandsuggestions {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?n=1");
	WebElement auto =	driver.findElement(By.id("fromPlaceName"));
	Actions act = new Actions(driver);
	act.sendKeys(auto,"mirya").build().perform();
	act.sendKeys(Keys.ARROW_DOWN).perform();
	act.sendKeys(Keys.ENTER).perform();

	}

}

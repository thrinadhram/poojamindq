package apsrtc12311;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.HOME).perform();
		actions.sendKeys(Keys.ARROW_RIGHT).perform();

	}

}

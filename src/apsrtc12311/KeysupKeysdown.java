package apsrtc12311;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysupKeysdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).perform();
		
		act.click(driver.findElement(By.xpath("//option[ @value ='volvo']")));
		Thread.sleep(4000);
		act.click(driver.findElement(By.xpath("//option[text() ='Audi']")));
		Thread.sleep(4000);
		act.keyUp(Keys.CONTROL).perform();

	}

}

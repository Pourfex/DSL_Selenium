package org.openqa.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class Test0 {
	
	@Test
	public void test(){		
		
		HashMap<String, WebElement> refsElement = new HashMap<>();
		boolean cookiesAlreadyChecked = false;
								
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.imt-atlantique.fr/fr");
		
		if(!cookiesAlreadyChecked) {
			new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='agree-button eu-cookie-compliance-default-button']"))).click(); //ACCEPT COOKIE		
			cookiesAlreadyChecked = true;
		}			
		WebElement textDemo0 = driver.findElement(By.xpath("//*[contains(text(),'Toutes les actualités')]"));
		assertNotNull(textDemo0);
		driver.close();
	}   				
}

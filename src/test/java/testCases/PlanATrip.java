package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class PlanATrip extends TestBase{
	
	@Test
	public void planTrip() throws InterruptedException
	{
		WebElement fromElement = driver.findElement(By.id(OR.getProperty("fromField")));
		fromElement.click();
		fromElement.sendKeys("North Sydney Station");
		Thread.sleep(2000);
		fromElement.sendKeys(Keys.ARROW_DOWN);
		fromElement.sendKeys(Keys.ENTER);
		WebElement toElement = driver.findElement(By.id(OR.getProperty("toField")));
		toElement.click();
		toElement.sendKeys("Town Hall Station");
		Thread.sleep(2000);
		toElement.sendKeys(Keys.ARROW_DOWN);
		toElement.sendKeys(Keys.ENTER);
				
		if (driver.findElement(By.cssSelector(OR.getProperty("resultElement")))!=null)
				System.out.println("Trip request successful and results returned");
		else
			System.out.println("Trip request not successful");
		
		
		List<WebElement> resultList = driver.findElements(By.xpath(OR.getProperty("resultList")));
		System.out.println("No of trips found : "+resultList.size());
		
		for (int i=0;i<resultList.size();i++) {
			System.out.println(resultList.get(i).getText());
		}
	}
}

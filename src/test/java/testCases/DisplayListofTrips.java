package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DisplayListofTrips extends PlanATrip{
	
	@Test
	public void displayResultList() {
		
		List<WebElement> resultList = driver.findElements(By.xpath(OR.getProperty("resultList")));
		System.out.println("No of trips found : "+resultList.size());
		
		for (int i=0;i<resultList.size();i++) {
			System.out.println(resultList.get(i).getText());
		}
	}

}

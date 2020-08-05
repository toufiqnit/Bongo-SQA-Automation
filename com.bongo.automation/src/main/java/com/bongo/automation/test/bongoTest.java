package com.bongo.automation.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bongo.automation.utils.UtilitiesDepot;
import com.bongo.automation.utils.baseclass;

public class bongoTest {

	@Test
	public void runSite() throws InterruptedException {
		WebDriver driver = baseclass.getDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get(UtilitiesDepot.Base_url);

		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement movies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UtilitiesDepot.Movies)));
		movies.click();

		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,145)");
		System.out.println("scrolled");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath(UtilitiesDepot.ViewAll)).click();

		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		
		System.out.println("List of Live TV opened");
		
		
		Thread.sleep(10000);
		
		System.out.println("Trying to click Independent TV");
		 
		 WebElement lokho =driver.findElement(By.xpath(UtilitiesDepot.Independent));
		 lokho.click(); 
		 
		 System.out.println("Clicked");
		 
		 driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		 
		 
		WebElement video = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UtilitiesDepot.Videojs)));
		
		
		 WebElement play =video.findElement(By.xpath(UtilitiesDepot.Play));
		
		 Thread.sleep(800);
		 System.out.println("Found");
		 play.isSelected();
		 play.click();	  
		 
		 System.out.println("Live Independent TV playing");
		 
	}
}


 
 

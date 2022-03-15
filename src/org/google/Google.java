package org.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shanmugaundaram\\eclipse-workspace\\Day2Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("greenstechnology");
		
		WebElement btnsearch = driver.findElement(By.name("btnk"));
		btnsearch.click();
		
	}

}

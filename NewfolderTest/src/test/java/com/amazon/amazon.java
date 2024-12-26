package com.amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("airpod");
		List<WebElement> suggestion =driver.findElements(By.id("nav-flyout-searchAjax"));
		System.out.println("All Suggestion:" +suggestion);
		for(WebElement element:suggestion) {
			System.out.println(element.getText().toString());
			if(element.getText().toString().equalsIgnoreCase("airpods 4")) {
				element.click();
			}
			}
		}
		
		
	}



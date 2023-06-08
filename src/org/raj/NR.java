package org.raj;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NR {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\DELL\\Desktop\\NoelRaj\\Lib\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://letcode.in/draggable");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("sample-box"));
		
		int x = source.getLocation().getX();
		int y = source.getLocation().getY();
		
		
		
	action.dragAndDropBy(source,x-30,y-50).perform();
	
}}

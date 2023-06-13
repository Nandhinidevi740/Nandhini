package org.testt1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkartsuggestion extends BaseClass {
	public static void main(String[] args) throws InterruptedException 
	{
		browserLanuch("chrome");
		urlLaunch("https://www.flipkart.com/");
		impilicitywait(30);
		maximize();
		WebElement cls = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click2(cls);
		WebElement src = driver.findElement(By.name("q"));
		sendkeys(src,"watch");
		Thread.sleep(3000);
		List<WebElement> srclst = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		for(WebElement x:srclst) {
			String text = x.getText();
			System.out.println(text);
		}
		
	}

}

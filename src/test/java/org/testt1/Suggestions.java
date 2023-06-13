package org.testt1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Suggestions extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserLanuch("chrome");
		urlLaunch("https://www.google.com/");
		impilicitywait(30);
		maximize();
		WebElement src = driver.findElement(By.name("q"));
	
		sendkeys(src,"air");
		Thread.sleep(3000);
		List<WebElement> srclst = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
            for(WebElement x:srclst) {
            	String text = x.getText();
            	System.out.println(text);
		}
		
	
		
		
	}

}

package org.testt1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ebay extends BaseClass{
	public static void main(String[] args) {
		browserLanuch("chrome");
		urlLaunch("https://www.ebay.com/");
		maximize();
		impilicitywait(30);
	    WebElement logo = driver.findElement(By.id("gh-logo"));
	    Click(logo);
	    List<WebElement> shopbycategory = driver.findElements(By.xpath("//body[@class='desktop gh-flex']"));
	    for(int i=0;i<shopbycategory.size();i++) {
	    	WebElement text = shopbycategory.get(i);
	    	System.out.println(text.getText());
	    	
	    }
	    
		
	}

}

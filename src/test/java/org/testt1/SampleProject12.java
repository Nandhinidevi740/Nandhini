package org.testt1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProject12 {
	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("nandhini");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("123456");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}

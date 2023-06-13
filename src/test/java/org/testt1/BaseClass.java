package org.testt1;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	public static WebDriver driver;
	public static WebDriver chromeBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver browserLanuch(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome")){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
	}
	return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void impilicitywait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void sendkeys(WebElement e,String a) {
		e.sendKeys(a);

	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	public static void click2(WebElement e) {
		e.click();

	}
	public static void close() {
		driver.close();
	}
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	}
	public static String getAttribute1(WebElement e) {
		String attribute = e.getAttribute("innertext");
		return attribute;
	}

	public static void MoveToElement(WebElement Target) {
		Actions a=new Actions(driver);
		a.moveToElement(Target).perform();
	}
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,des).perform();
	}
	public static void ContextClick(WebElement target) {
		Actions a=new Actions(driver);
		a.contextClick(target).perform();
	}
	public static void DoubleClick(WebElement target) {
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}
	public static void Click(WebElement target) {
		Actions a=new Actions(driver);
		a.clickAndHold(target).perform();
	}
	public static void release(WebElement target) {
		Actions a=new Actions(driver);
		a.release(target).perform();
	}
	public static void accept() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	public static void dismiss() {
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public static  void sendkeys(String value) {
		Alert a=driver.switchTo().alert();
		a.sendKeys(value);
	}
	public static void gettext() {
		Alert a=driver.switchTo().alert();
		a.getText();
	}
	public static void SelectByIndex(WebElement drpdown,int index) {
		Select s=new Select(drpdown);
		s.selectByIndex(index);
	}
	public static void selectByValue(WebElement drpdown,String Value) {
		Select s=new Select(drpdown);
		s.selectByValue("value");
	}
	public static void SelectByVisibleText(WebElement drpdown,String text) {
		Select s=new Select(drpdown);
		s.selectByVisibleText(text);
	}
	public void getOptions(WebElement drpdown) {
		Select s=new Select(drpdown);
		s.getOptions();
	}
	public static void isMultiple(WebElement drpdown) {
		Select s=new Select(drpdown);
		s.isMultiple();
	}
	public static void getAllSelectedOptions(WebElement drpdown) {
		Select s=new Select(drpdown);
		s.getAllSelectedOptions();
	}
	public static void getFirstselectedoptions(WebElement drpdown) {
		Select s=new Select(drpdown);
		s.getFirstSelectedOption();
	}
	public static void deselectAll(WebElement drpdown) {
		Select s=new Select(drpdown);
		s.deselectAll();
	}
	public static void deselectByvalue(WebElement drpdown,String value) {
		Select s=new Select(drpdown);
		s.deselectByValue("value");
	}
	public static void deselectByIndex(WebElement drpdown,int index) {
		Select s=new Select(drpdown);
		s.deselectByIndex(index);
	}
	public static void deselectbyVisibletext(WebElement drpdown,String text) {
		Select s=new Select(drpdown);
		s.deselectByVisibleText(text);
	}
	public static void getscreenShotsAS() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f=new File("src.png");
		File src = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, f);
	}
	public static void isDisplayed(WebElement e) {
		boolean b = e.isDisplayed();
	}
	public static void isenabled(WebElement e) {
		boolean b = e.isEnabled();
	}
	public static void isselected(WebElement e) {
		boolean b = e.isSelected();
	}
	public static void back() {
		driver.navigate().back();
	}
	private void forward() {
		driver.navigate().forward();
	}
	private void refresh() {
		driver.navigate().refresh();
	}
	public static void frame(int index) {
		driver.switchTo().frame(index);
	}
	public static void frame(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public static void frame(String name) {
		driver.switchTo().frame(name);
	}
	public static void getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
	}
	public static void getWindowHandles() {
		driver.getWindowHandles();


	}

}


  

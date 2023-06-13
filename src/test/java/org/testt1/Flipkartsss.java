package org.testt1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkartsss extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		browserLanuch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		impilicitywait(30);
		maximize();
		WebElement usr = driver.findElement(By.id("username"));
		sendkeys(usr, ("Nandhinideviannadura"));
		WebElement pw = driver.findElement(By.id("password"));
		sendkeys(pw, ("Star@123"));
		WebElement lgn = driver.findElement(By.id("login"));
		click2(lgn);
		WebElement location = driver.findElement(By.id("location"));
		SelectByIndex(location, 1);
		WebElement htl = driver.findElement(By.id("hotels"));
		SelectByIndex(htl, 2);
		WebElement room = driver.findElement(By.id("room_type"));
		SelectByIndex(room, 1);
		WebElement rmnos = driver.findElement(By.id("room_nos"));
		SelectByIndex(rmnos, 1);
		WebElement chkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		chkin.clear();
		sendkeys(chkin,"15/06/2023");
		WebElement chkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		chkout.clear();
		sendkeys(chkout,"18/06/2023");
		WebElement adultrm = driver.findElement(By.id("adult_room"));
		SelectByIndex(adultrm, 1);
		WebElement chldrm = driver.findElement(By.id("child_room"));
		SelectByIndex(chldrm, 1);
		WebElement submit = driver.findElement(By.id("Submit"));
		click2(submit);
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		click2(radiobtn);
		WebElement ctnue = driver.findElement(By.id("continue"));
		click2(ctnue);
		WebElement fstname = driver.findElement(By.id("first_name"));
		sendkeys(fstname,"Nandhinidevi");
		WebElement lstname = driver.findElement(By.id("last_name"));
		sendkeys(lstname,"A");
		WebElement address = driver.findElement(By.id("address"));
		sendkeys(address,"3/101,south street,venganur-621851");
		WebElement crt = driver.findElement(By.xpath("//input[@name='cc_num']"));
		sendkeys(crt,"5698741255621544");
		WebElement type = driver.findElement(By.id("cc_type"));
		SelectByIndex(type, 1);
		WebElement exdate = driver.findElement(By.id("cc_exp_month"));
		SelectByIndex(exdate, 2);
		WebElement exyr = driver.findElement(By.id("cc_exp_year"));
		SelectByIndex(exyr, 14);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendkeys(cvv,"258");
		WebElement book = driver.findElement(By.id("book_now"));
		click2(book);
		WebElement orderno = driver.findElement(By.id("order_no"));
		String text = getAttribute(orderno);
		System.out.println(text);
		WebElement book1 = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		click2(book1);
		Thread.sleep(3000);
		List<WebElement> list2 = driver.findElements(By.xpath("//table[@cellpadding='5']//td[2]/input"));
		List<WebElement> list = driver.findElements(By.xpath("//table[@cellpadding='5']//td[1]//input"));

		for(int i=0;i<list2.size();i++) {
			String data = list2.get(i).getAttribute("value");
			if(data.equals(text))
			{
				System.out.println(data);
				Thread.sleep(2000);
				
				for(int j=0;j<list.size();j++) {
					WebElement checkbox = list.get(list.size()-1);
					checkbox.click();
				}
				
				
//				WebElement findElement = driver.findElement(By.xpath("(//table[@cellpadding='5']//td[1]//input)["+(i+2)+"]"));
//				findElement.click();
				WebElement findElement2 = driver.findElement(By.xpath("//input[@name='cancelall']"));
				findElement2.click();
				accept();
				
				
//				Click(list.get(i));
//				Click(driver.findElement(By.xpath("(//table[@cellpadding='5']//td[1]//input)["+(i+1)+"]")));
//				Thread.sleep(2000);
//				Click(driver.findElement(By.xpath("//input[@name='cancelall']")));
//				accept();
				
				
			}

		}}}

































//		//WebElement srcbox = driver.findElement(By.id("order_id_text"));
//		//sendkeys(srcbox, text);
//		//WebElement go = driver.findElement(By.id("search_hotel_id"));
//		//click2(go);
//		//WebElement btn = driver.findElement(By.xpath("//input[@name='ids[]']"));
//		//click2(btn);
//		
//		WebElement table = driver.findElement(By.xpath("//table[@cellpadding='5']"));
//		String text2 = table.getText();
//		System.out.println(text2);
//	
//		List<WebElement> list = driver.findElements(By.xpath("//table[@cellpadding='5']//td//input"));
//		WebElement text4 = list.get(2);
//			String attribute = text4.getAttribute("value");
//			if(text.equals(attribute)) {
//				WebElement cancel = driver.findElement(By.xpath("//input[@name='cancelall']"));
//				click2(cancel)
//			
//				accept();
//			}
//			
//		}

















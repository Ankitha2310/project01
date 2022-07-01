package com.mindtree.seleniumclass;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;

public class selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/ ");
		driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("refrigerator");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	 //  driver.get("https://www.amazon.in/Samsung-Direct-Refrigerator-RR19A241BGS-NL/dp/B08SC2ZTDP/ref=sr_1_1_sspa?crid=1XRA0RXL9FKGM&keywords=samsung+192+l2+star+direct+cool+single+door+refrigerator&qid=1656005966&sprefix=samsung+192+l2%2Caps%2C299&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyVlJPRjdHODlTVjdTJmVuY3J5cHRlZElkPUEwMjA0MTk4M1Q0ME5KNDZCR0dITyZlbmNyeXB0ZWRBZElkPUEwOTIzNTMyMzRVOEVSSlY3WDBOTiZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
	   driver.findElement(By.xpath("//span[contains(text(),'Samsung 192 L 2')]")).click();
	    WebElement price1=driver .findElement(By.xpath("//span[@class='a-price-whole']"));
	   String pri=price1.getText();
	   WebElement price2=driver .findElement(By.className("a-price-whole"));
	   String  prinext=price1.getText();
	   if(prinext.equals(pri))
		   
	   {
		   System.out.println("same price");
	   }
	   else
	   {
		   System.out.println("not same");
	   }
	   
	  
	

	
	 
	}
}













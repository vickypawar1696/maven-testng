package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class second_test_Test {
	public WebDriver driver;
	@Test(priority=1)
	public void fb() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\my-app\\Binary\\chromedriver.exe");
       driver= new ChromeDriver();
      driver.get("https://www.utkarshaaacademy.com");
  }
	@Test(priority = 0)
  public void demo()
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\my-app\\Binary\\chromedriver.exe");
       driver= new ChromeDriver();
      driver.get("https://demoqa.com/dynamic-properties");
	
  }
	@Test(priority = 2)
  public void compare()
  {
	  String expectedTitle="Utkarshaa Academy";
	String actualtitle= driver.getTitle();
    Assert.assertEquals(actualtitle,expectedTitle);
  }
	@Test(priority = 3)
	public void url()
	{
		System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	}
}

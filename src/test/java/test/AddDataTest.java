package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddData;

import util.BrowserFactory;

public class AddDataTest {
	WebDriver driver;

	@Test
	public void ValidUserShouldAbleToAddTestData() throws InterruptedException {
		
		driver=BrowserFactory.init();
		
		AddData Adddata = PageFactory.initElements(driver, AddData.class );
		
		
		Adddata.AddElement("MD1");
		Adddata.Category("Test");
		
		Adddata.DueDateMonth("Feb");
		Thread.sleep(4000);

		Adddata.AddButton();
		Thread.sleep(2000);

		
		
		
		
		BrowserFactory.tearDown();
		
	}
}

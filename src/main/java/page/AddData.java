package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddData extends BasePage {
	WebDriver driver;

	@FindBy(how=How.XPATH, using="/html/body/div[4]/input[1]") WebElement ADD_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/select[1]\r\n") WebElement ADD_CATEGORY_ELEMENT;
	@FindBy(how=How.XPATH, using="//*[@id=\"extra\"]/select[3]\r\n") WebElement DUE_DATE_MONTH_ELEMENT;
	@FindBy(how=How.XPATH, using="/html/body/div[4]/input[2]") WebElement ADD_BUTTON;
	
	
	
	public void AddElement(String Element) {
		ADD_ELEMENT.sendKeys(Element);
	}
	
	public void Category(String CATEGORY) {
		selectDropdown(ADD_CATEGORY_ELEMENT, CATEGORY);
	}
	
	public void DueDateMonth(String month ) {
		selectDropdown(DUE_DATE_MONTH_ELEMENT, month);
	}
	
	public void AddButton() {
		ADD_BUTTON.click();
	}
	



	

	
	


}

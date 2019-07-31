package tablesearch;

import org.openqa.selenium.WebDriver;

public class MainTest {
	enum Browser {FireFox,Chrome,IE}
	
	public static final String TableTestPage = "file:" + System.getProperty("user.dir") + "/src/AutomationTest.html";


	public static void main(String[] args) {
		//Select which browser to user here
		Browser browser = Browser.Chrome;		
		WebDriver driver = DriverFactory.getNewDriver(browser);
		
		//Create a Method to get the page using the url in TableTestPage and Click the link in the row that contains the payor role. 
		
	}

}

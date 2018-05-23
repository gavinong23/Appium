package Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {
	
	private static final int KEYBOARD_ANIMATION_DELAY = 1000;
	private static final int XML_REFRESH_DELAY = 1000;
	
	protected final AppiumDriver driver;
	
	
	protected BasePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 100, TimeUnit.SECONDS), this);
	}
	
	protected boolean sendKeysToElement(String input, WebElement element, boolean appendNewLine) throws InterruptedException{
		final int MAX_ATTEMPTS = 3;
		int attempts = 0;
		
		do {
			element.clear();
			Thread.sleep(KEYBOARD_ANIMATION_DELAY);
			
			if(appendNewLine){
				element.sendKeys(input);
			}
			
		}while(!element.getText().contains(input) && ++attempts < MAX_ATTEMPTS);
		
		return element.getText().contains(input);
	}
	
	
}

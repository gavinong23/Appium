package Pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;


public class CreateRecipePage extends BasePage {
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathImageView)
	private MobileElement recipeImageView;
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathCameraRoll)
	private MobileElement cameraRoll;
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathSelectImage)
	private MobileElement selectImage;
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathConfirmImage)
	private MobileElement confirmImage;
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathRecipeName)
	private MobileElement recipeNameTextField;
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathShortIntro)
	private MobileElement recipeShortIntroTextField;
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathIngredient)
	private MobileElement recipeIngredientTextView;
	
	@iOSFindBy(xpath = ConfigCreateRecipe.xPathReturnButton)
	private MobileElement returnButton;
	
	@iOSFindBy(xpath = ConfigCreateRecipe.xPathRecipeType)
	private MobileElement recipeTypePicker;
	
	@iOSFindBy(id = ConfigCreateRecipe.xPathBtnCreateRecipe)
	private MobileElement submitRecipeButton;

	public CreateRecipePage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean takeScreenshot(final String name) {
		  String screenshotDirectory = "/Users/gavinong/eclipse-workspace/allthebest/screenshots/";
	      // String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
	       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	       return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	 }
	
	public boolean submitRecipe(String recipeName, String recipeShortIntro, String recipeIngredient, String recipeType) throws InterruptedException {
		
		if(recipeName != "" && recipeShortIntro != "" && recipeIngredient != "" && recipeType != "") {
			//System.out.println(recipeName);
//			recipeImageView.click();
//			Thread.sleep(10000);
//			cameraRoll.click();
//			Thread.sleep(10000);
//			selectImage.click();
//			Thread.sleep(10000);
//			confirmImage.click();
			Thread.sleep(10000);
			recipeNameTextField.click();
			Thread.sleep(3000);
			recipeNameTextField.sendKeys(recipeName);
			Thread.sleep(3000);
			takeScreenshot("1");
			Thread.sleep(5000);
			recipeShortIntroTextField.click();
			takeScreenshot("2");
			Thread.sleep(5000);
			recipeShortIntroTextField.sendKeys(recipeShortIntro);
			Thread.sleep(5000);
			recipeIngredientTextView.click();
			Thread.sleep(5000);
			recipeIngredientTextView.sendKeys(recipeIngredient);
			Thread.sleep(5000);
			returnButton.click();
			Thread.sleep(5000);
			recipeTypePicker.sendKeys(recipeType);
			Thread.sleep(5000);
			takeScreenshot("3");
			submitRecipeButton.click();
			
			return true;
		}
		return false;
	}
	
	public String getSuccessMessage() {
		System.out.print(driver.findElementByXPath(ConfigCreateRecipe.xPathNegDialogMessage).getText());
		return driver.findElementByXPath(ConfigCreateRecipe.xPathNegDialogMessage).getText();
	}

}

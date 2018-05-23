package Tests;

import Pages.ConfigCreateRecipe;
import Pages.CreateRecipePage;
import Tests.AbstractBaseTests.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateRecipePageTest extends TestBase{
	
	private CreateRecipePage createRecipePage;

	@Override
	public String getName() {
		return "Create Recipe Page";
	}

	@BeforeTest
	@Override
	public void setUpPage() {
		createRecipePage = new CreateRecipePage(driver);
	}
	
	@Test
	public void createRecipeSuccess() throws InterruptedException {
		Assert.assertTrue(createRecipePage.submitRecipe(ConfigCreateRecipe.strPosRecipeName, ConfigCreateRecipe.strPosShortIntro, ConfigCreateRecipe.strPosIngredient,ConfigCreateRecipe.strPosRecipeType));
		Assert.assertEquals(createRecipePage.getSuccessMessage(), ConfigCreateRecipe.strNegDialogMessage);
	}
	
}

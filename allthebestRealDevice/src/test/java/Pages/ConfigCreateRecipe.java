package Pages;

public class ConfigCreateRecipe {
	
	//Element Path
	public final static String xPathImageView = "//XCUIElementTypeApplication[@name=\"FoodMad\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage";
	public final static String xPathCameraRoll = "//XCUIElementTypeCell[@name=\"Camera Roll\"]";
	public final static String xPathSelectImage = "//XCUIElementTypeCell[@name=\"Photo, Portrait, August 09, 2012, 5:29 AM\"]";
	public final static String xPathConfirmImage = "//XCUIElementTypeButton[@name=\"Choose\"]";
	public final static String xPathCancelImage = "//XCUIElementTypeButton[@name=\"Cancel\"]";
	public final static String xPathRecipeName = "createRecipeTfName";
//	public final static String xPathRecipeName = "//XCUIElementTypeTextField[@name=\"createRecipeTfName\"]";
	public final static String xPathShortIntro = "createRecipeTfShortIntro";
	//public final static String xPathShortIntro = "//XCUIElementTypeTextField[@name=\"createRecipeTfShortIntro\"]";
	//public final static String xPathIngredient = "//XCUIElementTypeTextView[@name=\"createRecipeTfIngredient\"]";
	public final static String xPathIngredient = "createRecipeTfIngredient";
	public final static String xPathReturnButton = "//XCUIElementTypeButton[@name=\"Return\"]";
	public final static String xPathRecipeType = "//XCUIElementTypePicker[@name=\"createRecipePickerType\"]/XCUIElementTypePickerWheel";
	//public final static String xPathRecipeType = "//XCUIElementTypePicker[@name=\"createRecipePickerType\"]/XCUIElementTypePickerWheel";
	public final static String xPathBtnCreateRecipe = "createRecipeBtnSubmit";
	//public final static String xPathBtnCreateRecipe = "//XCUIElementTypeButton[@name=\"createRecipeBtnSubmit\"]";
	public final static String xPathBtnDialogConfirm = "//XCUIElementTypeButton[@name=\"OK\"]";
	
		//Dialog - neg
		public static String xPathNegDialogTitle = "//XCUIElementTypeStaticText[@name=\"Invalid Data\"]";
		public static String xPathNegDialogMessage = "//XCUIElementTypeStaticText[@name=\"Please fill in all the fields.\"]";
		
		//Dialog - pos
		public static String xPathPosDialogTitle = "//XCUIElementTypeStaticText[@name=\"Congratulation\"]";
		public static String xPathPosDialogMessage = "//XCUIElementTypeStaticText[@name=\"Create Recipe Successfully.\"]";
		
	//Enter Positive Value
	public static String strPosRecipeName = "Carbonara Spaghetti";
	public static String strPosShortIntro = "Spaghetti with delicious milk cream.";
	public static String strPosIngredient = "milk, spaghetti, parsley, salad";
	public static String strPosRecipeType = "Healthy";
	public static String strPosDialogTitle = "Congratulation";
	public static String strPosDialogMessage = "Create Recipe Successfully.";
	
	//Enter Negative Value
	public static String strNegXPathImageView = "";
	public static String strNegRecipeName = "";
	public static String strNegShortIntro = "";
	public static String strNegIngredient = "";
	public static String strNegRecipeType = "Vegetarian";
	public static String strNegDialogTitle = "Invalid Data";
	public static String strNegDialogMessage = "Please fill in all the fields.";
	

	
}

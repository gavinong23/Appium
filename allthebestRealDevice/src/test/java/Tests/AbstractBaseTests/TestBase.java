package Tests.AbstractBaseTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


public abstract class TestBase {
	
	public static  IOSDriver<MobileElement> driver;
	
	public abstract String getName();
	
	@BeforeTest
	public abstract void setUpPage();
	
	@BeforeSuite
	public void setupAppium() throws MalformedURLException{
		final String URL_STRING = Config.appiumServerUrl;
		
		URL url = new URL(URL_STRING);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		File file = new File(Config.appFilePath);
		cap.setCapability("automationName","XCUITest");
		cap.setCapability("xcodeOrgId", Config.xcodeOrgId);
		cap.setCapability(MobileCapabilityType.UDID, Config.UDID);
		cap.setCapability( "xcodeSigningId", "iPhone Developer");
		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, Config.platformVersion);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, Config.deviceName);
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Config.platformName);
		cap.setCapability("bundleId", Config.bundleId);
		
		cap.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());	
		//cap.setCapability("useNewWDA", Config.useNewWDA);
		//cap.setCapability(MobileCapabilityType.NO_RESET, Config.noReset);
		//cap.setCapability("clearSystemFiles", true);
		//cap.setCapability("wdaStartupRetryInterval", 10000000);
		//cap.setCapability("waitForQuiescence", false);
		//cap.setCapability("shouldUseSingletonTestManager", false);
		//cap.setCapability(MobileCapabilityType.ORIENTATION, "PORTRAIT");
		
		
		driver = new IOSDriver<MobileElement>(url, cap);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void tearDownAppium() {
		driver.quit();
	}
	
	
//	@AfterClass
//	public void restartApp() {
//		driver.resetApp();
//	}
}

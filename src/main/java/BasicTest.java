import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import static org.apache.commons.io.FileUtils.moveFile;

// please don't start test and don't add test cases here
abstract public class BasicTest {
    private  static final Logger LOGGER= Logger.getLogger(String.valueOf(BasicTest.class));
    protected WebDriver driver;

    @BeforeMethod
    protected void setup(){
        System.setProperty("webdriver.gecko.driver", "C:/Users/Alena_Kavaleuskaya/IdeaProjects/Selenium1/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void close(ITestResult testResult)  {
        makeScreenShot(testResult);
        driver.quit();
    }

    private void makeScreenShot(ITestResult testResult){
        if(!testResult.isSuccess()) {
            File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                moveFile(screenShot, new File("C:/Users/Alena_Kavaleuskaya/Pictures/Saved Pictures/" +testResult.getName() + ".png"));
            } catch (IOException e) {
                LOGGER.fine(e.getMessage());
            }
        }
}
}

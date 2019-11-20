package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DemoFormPage extends Page{
        @FindBy(id= "user-message")
        private WebElement UserMessageInput;

          @FindBy(xpath= "/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")
          private WebElement ShowMessageButton;

         @FindBy(id= "display")
         private WebElement UserMessage;

    @FindBy(id= "sum1")
    private WebElement sum1Input;

    @FindBy(id= "sum2")
    private WebElement sum2Input;

    @FindBy(xpath= "/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")
    private WebElement  getTotalButton;

    @FindBy(id= "displayvalue")
    private WebElement totalResultMessage;

    public  DemoFormPage (WebDriver driver){
        super(driver, "https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }


    public String singleInputForm(String inputMessage){

       UserMessageInput.sendKeys(inputMessage);
        ShowMessageButton.click();
        return UserMessage.getText();
    }


    public String multiInputForm(String a,String b){
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

            sum1Input.sendKeys(a);

            sum2Input.sendKeys(b);

            getTotalButton.click();

            return totalResultMessage.getText();


    }
}

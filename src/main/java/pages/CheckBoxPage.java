package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends Page{
        @FindBy(id ="isAgeSelected")
        private WebElement ageCheckBox;

    @FindBy(id ="txtAge")
    private WebElement ageText;

       public CheckBoxPage (WebDriver driver){
       super(driver, "https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }
    public String singleCheckBoxForm(){

        ageCheckBox.click();

        return ageText.getText();
    }
}

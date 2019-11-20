import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.DemoFormPage;

public class MenuTest extends BasicTest {
    @Test
    public void navigationToFormPageTest(){
        DemoFormPage demoFormPage=new DemoFormPage(driver);
        demoFormPage.navigate2Menu(new String[] {"Input Forms", "Single Form Demo"});

        Assertions.assertThat(driver.getTitle()).isEqualTo("Selenium Easy Demo - Simple Form to Automate using Selenium");
    }

    @Test
    public void navigationToCheckboxPageTest(){
        CheckBoxPage checkBoxPage=new CheckBoxPage(driver);
        checkBoxPage.navigate2Menu(new String[] {"Input Forms", "CheckBox Demo"});
        Assertions.assertThat(driver.getTitle()).isEqualTo("Selenium Easy - Checkbox demo for automation using selenium");
    }
}

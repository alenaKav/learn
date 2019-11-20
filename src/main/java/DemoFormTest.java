import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.DemoFormPage;

public class DemoFormTest extends BasicTest{

    @Test
    public void singleInputTest() {

                    String outputMessage=new DemoFormPage(driver).singleInputForm("Hello");


                   Assertions.assertThat( "Hello").isEqualTo(outputMessage);


        }

    @Test
    public void multiInputTest() {

        String totalResult = new DemoFormPage(driver).multiInputForm("2", "3");

        Assertions.assertThat("5").isEqualTo(totalResult);

    }
    @Test
    public void multiInputNanTest(){
        String totalResult = new DemoFormPage(driver).multiInputForm("2", "abc");

        Assertions.assertThat("Nan").isEqualTo(totalResult);
    }
    @Test
    public void multiInputNan1Test(){
        String totalResult = new DemoFormPage(driver).multiInputForm("abc", "2");

        Assertions.assertThat("NaN").isEqualTo(totalResult);
    }
}

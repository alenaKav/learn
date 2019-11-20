import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import org.assertj.core.api.Assertions;

import org.testng.annotations.Test;
import pages.CheckBoxPage;


public class CheckBoxTest extends BasicTest{
    private static final Logger LOGGER= Logger.getLogger(CheckBoxTest.class);

    @Test
    public void singleCheckBoxTest() {
        BasicConfigurator.configure();
        LOGGER.info("invoke single checkboxtest");
        String outputMessage=new CheckBoxPage(driver).singleCheckBoxForm();
        LOGGER.error("Error happened");
        Assertions.assertThat( "Success - Check box is checked").isEqualTo(outputMessage);




    }
}

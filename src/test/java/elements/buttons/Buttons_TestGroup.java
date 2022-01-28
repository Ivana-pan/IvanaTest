package elements.buttons;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setup.SuiteSetup;

public class Buttons_TestGroup
{
    private Buttons_Pom page = new Buttons_Pom();
    private WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = SuiteSetup.getDriver();
    }

    @Test(priority = 0)
    void OpenPageTest()
    {
        System.out.println("Buttons_TestGroup_OpenPageTest");
        page.openPage();
        Assert.assertEquals(driver.getCurrentUrl(), page.getPageUrl());
    }

}

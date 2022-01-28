package elements.buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import setup.SuiteSetup;

public class Buttons_Pom
{
    private final String URL = "https://demoqa.com/buttons";
    private final WebDriver DRIVER = SuiteSetup.getDriver();

    public Buttons_Pom()
    {
        PageFactory.initElements(DRIVER, this);
    }

    public void openPage()
    {
        SuiteSetup.getDriver().get(URL);
    }

    public String getPageUrl()
    {
        return URL;
    }
}

package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.time.Duration;

public class SuiteSetup
{
    private static WebDriver driver;

    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("setup.SuiteSetup - before suite");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterSuite
    void afterSuite() throws IOException
    {
        System.out.println("setup.SuiteSetup - after suit");
        driver.close();
        Runtime.getRuntime().exec("taskkill /R /IM chromedriver.exe /T");
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}

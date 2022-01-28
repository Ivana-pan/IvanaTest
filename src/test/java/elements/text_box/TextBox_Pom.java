package elements.text_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TextBox_Pom
{
    WebDriver wd;

    public TextBox_Pom(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(wd,this);
    }

    @FindBy(id = "userName")
    WebElement userNameAndLastname;

    @FindBy(id = "userEmail")
    WebElement email;

    @FindBy(id = "currentAddress")
    WebElement address;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    @FindBy(id = "submit")
    WebElement submitButton;

    public void enteringData(String firstandlastName,String mail,String homeAddress,String permAddress){
        userNameAndLastname.sendKeys(firstandlastName);
        email.sendKeys(mail);
        address.sendKeys(homeAddress);
        permanentAddress.sendKeys(permAddress);
        submitButton.click();

        String unos = wd.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[6]/div")).getText();
        Assert.assertTrue(unos.contains(firstandlastName),"The data entered does not match the data displayed.");
    }
}

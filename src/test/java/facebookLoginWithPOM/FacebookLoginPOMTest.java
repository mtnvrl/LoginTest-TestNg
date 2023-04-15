package facebookLoginWithPOM;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class FacebookLoginPOMTest {

    @Test
    public void test01(){
        FacebookPage facebookPage=new FacebookPage();
        Faker faker=new Faker();

        String eMail=faker.internet().emailAddress();
        String passW=faker.internet().password();

        Driver.getDriver().get("https://www.facebook.com/");

        facebookPage.emailBox.sendKeys(eMail);

        facebookPage.passBox.sendKeys(passW);

        facebookPage.loginButton.click();

        Assert.assertTrue(facebookPage.warningText.isDisplayed());

        Driver.closeDriver();
    }
}

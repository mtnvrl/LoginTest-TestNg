package loginFormFaker;

import com.github.javafaker.Faker;
import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class LoginFormFakerTest extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Actions actions=new Actions(driver);

        driver.findElement(By.xpath("(//a[@data-testid='open-registration-form-button'])[1]")).click();

        WebElement nameBox= driver.findElement(By.xpath("(//input[@name='firstname'])[1]"));
        Faker faker=new Faker();
        String fakeMail=faker.internet().emailAddress();
        actions.click(nameBox).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).sendKeys(fakeMail).sendKeys(Keys.TAB).sendKeys(fakeMail).
                sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("15").sendKeys(Keys.TAB).sendKeys("Jan").sendKeys(Keys.TAB).sendKeys("2000").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).click().perform();
        Thread.sleep(2000);
    }

}

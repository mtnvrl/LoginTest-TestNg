package searchResultsJUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class SearchItemOnResultsTest extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        Actions actions=new Actions(driver);
        driver.get("https://www.amazon.com/");

        WebElement dropDownMenu= driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select select=new Select(dropDownMenu);
        select.selectByVisibleText("Books");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("math books"+ Keys.ENTER);

        int count=0;
        do {
            Thread.sleep(1000);
            actions.scrollByAmount(0,1400).perform();
            count++;
        }while (count<=2);


        WebElement findResult=driver.findElement(By.xpath("//img[@alt='Math Games with Bad Drawings: 75 1/4 Simple, Challenging, Go-Anywhere Games―And Why They Matter']"));
        Assert.assertTrue(findResult.isDisplayed());





    }

}

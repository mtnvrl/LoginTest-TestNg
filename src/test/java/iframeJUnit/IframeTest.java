package iframeJUnit;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class IframeTest extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement headerEl =driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerEl.isEnabled());

        WebElement iFrameEl=driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iFrameEl);

        WebElement textBox=driver.findElement(By.xpath("//body[@id='tinymce']"));
        Thread.sleep(1000);
        textBox.clear();
        textBox.sendKeys("Hello  World!");
        Thread.sleep(1000);


        driver.switchTo().defaultContent();

        WebElement linkTextEl= driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(linkTextEl.isDisplayed());

    }
}

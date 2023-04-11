package priorityTestNG;

import org.testng.annotations.Test;
import utilities.TestBase;

public class PrioritiesTestNGTest extends TestBase {
    @Test(priority = 3)
    public void test01(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority = 1)
    public void test02(){
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority = 2)
    public void test03(){
        driver.get("https://www.facebook.com");
        System.out.println(driver.getCurrentUrl());
    }

}

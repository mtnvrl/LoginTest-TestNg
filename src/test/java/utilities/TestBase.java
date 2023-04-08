package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
    public abstract class TestBase {
        protected WebDriver driver;
        @Before
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver=new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        @After
        public void tearDown() throws InterruptedException {
             driver.quit();
             Thread.sleep(2000);
        }
}

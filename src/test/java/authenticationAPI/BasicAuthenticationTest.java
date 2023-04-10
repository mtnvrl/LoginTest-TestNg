package authenticationAPI;

import org.junit.Test;
import utilities.TestBase;

public class BasicAuthenticationTest extends TestBase {

    @Test

    public void test01(){

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }






}

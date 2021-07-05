package TestScripts;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import Pages.CreateAccountPage;
import Pages.Homepage;
import Pages.LoginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CreateAccountTest {
    public static void main(String[] args) throws IOException, ParseException {
        WebDriver driver=DriverSelection.select("chrome");
        driver.get("https://www.google.com");
        driver.get("http://automationpractice.com/index.php");
        Homepage homepage=new Homepage(driver);
        CreateAccountPage createAccountPage=new CreateAccountPage(driver);
        LoginPage loginPage=new LoginPage(driver);        try {
            homepage.GoToSignInPage();
            loginPage.TypeEmail();
            loginPage.ClickCreateAccount();
            createAccountPage.FillDetails();
            System.out.println(driver.getTitle());
//            createAccountPage.submitDetails();
        }
        finally {
            driver.quit();
        }
    }
}

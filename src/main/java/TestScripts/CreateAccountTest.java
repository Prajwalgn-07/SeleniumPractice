package TestScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.CreateAccountPage;
import pages.Homepage;
import pages.LoginPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CreateAccountTest {
    public static void main(String[] args) throws IOException, ParseException {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver=new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.get("http://automationpractice.com/index.php");
        Homepage homepage=new Homepage(driver);
        CreateAccountPage createAccountPage=new CreateAccountPage(driver);
        LoginPage loginPage=new LoginPage(driver);
        try {
            homepage.GoToSignInPage();
            loginPage.TypeEmail();
            loginPage.ClickCreateAccount();
            createAccountPage.FillDetails();
//            createAccountPage.submitDetails();
        }
        finally {
            driver.quit();
        }
    }
}

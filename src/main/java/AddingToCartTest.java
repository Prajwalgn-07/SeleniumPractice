import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AddingToCartTest {
    public static void main(String[] args) throws IOException {
//        Properties properties=new Properties();
//        FileInputStream inputStream=new FileInputStream("/Users/prajwal/Desktop/testvagrant /assignment projects/SeleniumJava/src/main/java/Properties/file.properties");
//        properties.load(inputStream);
//        System.out.println(properties.getProperty("name"));

//        FileOutputStream outputStream=new FileOutputStream("/Users/prajwal/Desktop/testvagrant /assignment projects/SeleniumJava/src/main/java/Properties/file.properties");
//        properties.setProperty();
//        properties.store(outputStream,null);
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.get("http://automationpractice.com/index.php");
        Homepage homepage=new Homepage(driver);
        CartPage cart=new CartPage(driver);
        ShortPrintedDressPage shortPrintedDress=new ShortPrintedDressPage(driver);
        LongPrintedDressPage longPrintedDress=new LongPrintedDressPage(driver);
        try {
            homepage.ViewShortPrintedDress();
            shortPrintedDress.AddShortPrintedDressToCart(driver);
            driver.navigate().back();
            homepage.ViewLongPrintedDress();
            longPrintedDress.AddLongPrintedDressToCart(driver);
            driver.navigate().back();
            homepage.ViewCart();
            cart.GetTotalAmountInCart();
       }
        finally {
            driver.quit();
        }
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice {
    public static void main(String[] args) throws IOException {
//        Properties properties=new Properties();
//        FileInputStream inputStream=new FileInputStream("/Users/prajwal/Desktop/testvagrant /assignment projects/SeleniumJava/src/main/java/Properties/file.properties");
//        properties.load(inputStream);
//        System.out.println(properties.getProperty("name"));

//        FileOutputStream outputStream=new FileOutputStream("/Users/prajwal/Desktop/testvagrant /assignment projects/SeleniumJava/src/main/java/Properties/file.properties");
//        properties.setProperty();
//        properties.store(outputStream,null);
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver=new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.get("http://automationpractice.com/index.php");
        WebDriverWait wait=new WebDriverWait(driver,10);
        try {
            WebElement printedDress1 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[2]/h5/a"));
            printedDress1.click();
            WebElement pd1AddToCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
            pd1AddToCart.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/div[1]/img")));
            driver.navigate().back();
            WebElement printedDress2 = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/h5/a"));
            printedDress2.click();
            WebElement pd2AddToCart = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
            pd2AddToCart.click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/div[1]/img")));
            driver.navigate().back();
            WebElement viewCart = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"));
            viewCart.click();
            String totalAmount = driver.findElement(By.xpath("//*[@id=\"total_price\"]")).getText();
            System.out.println("The total amount in the cart is: " + totalAmount);
        }
        finally {
            driver.quit();
        }
    }
}

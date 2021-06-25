import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream inputStream=new FileInputStream("/Users/prajwal/Desktop/testvagrant /assignment projects/SeleniumJava/src/main/java/Properties/file.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("name"));

//        FileOutputStream outputStream=new FileOutputStream("/Users/prajwal/Desktop/testvagrant /assignment projects/SeleniumJava/src/main/java/Properties/file.properties");
//        properties.setProperty();
//        properties.store(outputStream,null);
//        WebDriver driver=new ChromeDriver();
//        WebDriverManager.chromedriver().setup();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("https://www.google.com");

    }
}

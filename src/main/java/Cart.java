import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cart extends PageInitialisation {
    public Cart(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"total_price\"]")
    WebElement totalAmount;
    public void GetTotalAmountInCart(){
        System.out.println("The total amount in Cart is:"+totalAmount.getText());
    }

}

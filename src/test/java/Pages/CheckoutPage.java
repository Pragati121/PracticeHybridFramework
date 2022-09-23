package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By Cart2             = By.xpath("(//button[@type='button'])[5]");
    By Cart123           = By.xpath("");

    public CheckoutPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void checkout(){
        driver.findElement(Cart2).click();
//        driver.findElement(Shoppingcart).click();
//        driver.findElement(Checkbox).click();
//        driver.findElement(Checkout).click();
    }

}


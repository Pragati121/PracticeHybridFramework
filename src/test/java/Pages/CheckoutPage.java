package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By Cart2             = By.xpath("//button[@id='add-to-cart-button-5']");
    By Shoppingcart      =  By.xpath("//a[@class='ico-cart']");
    By Checkbox          =  By.xpath("//input[contains(@name,'termsofservice')]");
    By Checkout          = By.xpath("//button[@name='checkout']");
}


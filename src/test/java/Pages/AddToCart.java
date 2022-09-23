package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
    WebDriver driver;

    By Addtocart=By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']");
    By ShoppingCart =By.xpath("//span[@class='shopping_cart_badge']");
    By  Checkout= By.xpath("//button[@name='checkout']");
    public AddToCart(WebDriver driver){
        this.driver = driver;
}
        public void CartMethod(){
      driver.findElement(Addtocart).click();
        driver.findElement(ShoppingCart).click();
            driver.findElement(Checkout).click();
    }
}


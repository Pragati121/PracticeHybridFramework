package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private HomePage Home;
    private AddToCart Cart;
    private BillingInfo Bill;
    private BackHome  Backh;
    WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHome() {
        if (Home == null) {
            Home = new HomePage(driver);
        }
        return Home;
    }

    public AddToCart getCart() {
        if (Cart == null) {
            Cart = new AddToCart(driver);
        }
        return Cart;
    }

    public BillingInfo getBill() {
        if (Bill == null) {
            Bill = new BillingInfo(driver);
        }
        return Bill;
    }
    public BackHome getBackh() {
        if (Backh == null) {
            Backh = new BackHome(driver);
        }
        return Backh;
    }
}

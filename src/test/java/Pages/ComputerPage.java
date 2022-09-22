package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComputerPage {
    WebDriver driver;
    WebDriverWait wait;
    By ComputerHyperlink = By.xpath("//a[text()='Computers ']");
    By Notebook = By.xpath("//a[text()=' Notebooks ']");
    By Product = By.xpath("//a[contains(text(),'Asus N551JK-XO076H Laptop')]");

    public ComputerPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void ComputerUser() {
        driver.findElement(ComputerHyperlink).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Notebook));
        driver.findElement(Notebook).click();
        driver.findElement(Product).click();

    }
}

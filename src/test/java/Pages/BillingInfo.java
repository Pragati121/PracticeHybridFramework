package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillingInfo {




    WebDriver driver;

    By Firstname=By.xpath("//input[@name='firstName']");
    By Lastname=By.xpath("//input[@name='lastName']");
    By Zipcode=By.xpath("//input[@id='postal-code']");
    By Continue=By.xpath("//input[@name='continue']");
    By Finish = By.xpath("//button[@name='finish']");
    public BillingInfo(WebDriver driver){
        this.driver = driver;
    }
    public void BillMethod(){
        driver.findElement(Firstname).sendKeys("pragati");
        driver.findElement(Lastname).sendKeys("sharma");
        driver.findElement(Zipcode).sendKeys("153884");
        driver.findElement(Continue).click();
        driver.findElement(Finish).click();
    }
}


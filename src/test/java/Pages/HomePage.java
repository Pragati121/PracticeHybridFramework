package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
       WebDriver driver;

        By WelcomeText  =By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public HomePage(WebDriver driver){
            this.driver = driver;
        }
        public void HomeUser()  {
            driver.findElement(WelcomeText).click();
            String actual = driver.findElement(WelcomeText).getText();
            Assert.isTrue(actual.equals("Welcome to our store"), "Expected result does not match with actual result");
        }
    }

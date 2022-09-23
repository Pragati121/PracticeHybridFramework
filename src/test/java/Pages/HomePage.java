package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
       WebDriver driver;

        By Username=By.xpath("//input[@name='user-name']");
        By Password=By.xpath("//input[@name='password']");
        By Login   =By.xpath("//input[@name='login-button']");
    public HomePage(WebDriver driver){
            this.driver = driver;
        }
        public void HomeUser()  {
            driver.findElement(Username).sendKeys("standard_user");
            driver.findElement(Password).sendKeys("secret_sauce");
            driver.findElement(Login).click();
        }
    }

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BackHome {
    WebDriver driver;

    By BackHome=By.xpath("//button[@name='back-to-products']");
    public BackHome(WebDriver driver){
        this.driver = driver;
    }
    public void BackMethod(){
        driver.findElement(BackHome).click();
    }
}


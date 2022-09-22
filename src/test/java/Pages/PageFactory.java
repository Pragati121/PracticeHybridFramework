package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    private HomePage Home;
    private ComputerPage Computer;
    WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage getHome(){
        if(Home==null)
        {
            Home=new HomePage(driver);
        }
        return Home;
    }

    public ComputerPage getComputer() {
        if(Computer==null)
        {
            Computer=new ComputerPage(driver);
        }
        return Computer;
    }
}

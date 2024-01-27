package pagePackage;

import driverPackage.Initialization;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class detailsPAge extends Initialization {
    AppiumDriver driver;
    By backBtn = By.id("com.continuum.emi.calculator:id/actionMenuBack");
    public detailsPAge(AppiumDriver driver){
        this.driver = driver;
    }
    public void clickBack(){
        driver.findElement(backBtn).click();
    }
}

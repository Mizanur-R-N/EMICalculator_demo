package pagePackage;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class emiCalculationPage {
    AppiumDriver driver;
    By EMI_Cal = By.id("com.continuum.emi.calculator:id/btnStart");
    By amount = By.id("com.continuum.emi.calculator:id/etLoanAmount");
    By interest = By.id("com.continuum.emi.calculator:id/etInterest");
    By period_year = By.id("com.continuum.emi.calculator:id/etYears");
    By proFee = By.id("com.continuum.emi.calculator:id/etFee");
    By CalBtn = By.id("com.continuum.emi.calculator:id/btnCalculate");
    By resetBtn = By.id("com.continuum.emi.calculator:id/btnReset");
    By detailsBtn = By.id("com.continuum.emi.calculator:id/btnDetail");

    public emiCalculationPage(AppiumDriver driver){
        this.driver = driver;
    }
    public void clickEMI(){
        driver.findElement(EMI_Cal).click();
    }

    public void setAmount(String amount1){
        driver.findElement(amount).clear();
        driver.findElement(amount).sendKeys(amount1);
    }
    public void setInterest(String interest1){
        driver.findElement(interest).clear();
        driver.findElement(interest).sendKeys(interest1);
    }
    public void setPeriod_year(String year){
        driver.findElement(period_year).clear();
        driver.findElement(period_year).sendKeys(year);
    }
    public void setProFee(String pFee){
        driver.findElement(proFee).clear();
        driver.findElement(proFee).sendKeys(pFee);
    }
    public void clickCalculate(){
        driver.findElement(CalBtn).click();
    }

    public void CalculateEMI(String Amount, String Interest, String Years, String processingFee){
        this.setAmount(Amount);
        this.setInterest(Interest);
        this.setPeriod_year(Years);
        this.setProFee(processingFee);
        this.clickCalculate();
    }
    public void clickDetails(){
        driver.findElement(detailsBtn).click();
    }

    public void clickReset(){
        driver.findElement(resetBtn).click();
    }



}

package testPackage;

import driverPackage.Initialization;
import pagePackage.*;
import dataProvidingPackage.DataProvidorEMI;
import org.testng.annotations.Test;

public class EMICalculation extends Initialization {
    emiCalculationPage objemi;
    detailsPAge objDtls;

    @Test(priority = 1)
    void HomePage() throws InterruptedException {
        objemi = new emiCalculationPage(driver);
        objemi.clickEMI();
        Thread.sleep(2000);
    }

    @Test(priority = 2, dataProvider = "emiCredentails", dataProviderClass = DataProvidorEMI.class)
    void EMIcalculation_functionality(String Amount, String Interest, String Years, String processingFee) throws InterruptedException {
        objemi.CalculateEMI(Amount,Interest,Years,processingFee);
        Thread.sleep(10000);
    }

    @Test(priority = 3)
    void DetailsPage() throws InterruptedException {
        objemi.clickDetails();
        Thread.sleep(10000);
    }
    @Test(priority = 4)
    void ResetPage() throws InterruptedException {
        objDtls = new detailsPAge(driver);
        objDtls.clickBack();
        Thread.sleep(2000);
        objemi.clickReset();
        Thread.sleep(2000);
    }


}

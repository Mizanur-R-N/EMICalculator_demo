package dataProvidingPackage;

import org.testng.annotations.DataProvider;

public class DataProvidorEMI{
    @DataProvider(name = "emiCredentails")
    public static Object[][] DataSet() {
        return new Object[][]{
                {"100000","9.0","2","2.0"},
                {"325000","9.5","5","1.5"},
                {"450000","11.0","7","1.8"},
                {"99000000","10.0","4","1.25"},
                {"50000","12.0","9","2.2"}
        };
    }
}

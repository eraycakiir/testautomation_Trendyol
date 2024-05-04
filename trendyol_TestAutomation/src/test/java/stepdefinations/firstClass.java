package stepdefinations;

import org.testng.annotations.Test;
import utils.Driver;

public class firstClass extends Driver {
    @Test
    public void test1(){
        Driver.getDriver();
        System.out.println("test1");
    }
}

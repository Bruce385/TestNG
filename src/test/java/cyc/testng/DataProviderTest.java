package cyc.testng;

import cyc.bruce.utils.MathSolution;
import org.testng.annotations.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DataProviderTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @DataProvider
    public Object[][] paramData() {
        return new Object[][]{
                {"Add 1 + 2", 1, 2, 3},
                {"Add null + null", null, null, null},
                {"Add 10 + 20", 10, 20, 30},
                {"Add Big", Integer.MAX_VALUE, Integer.MAX_VALUE, null}
        };
    }

    //指定使用哪个DataProvider
    @Test(dataProvider = "paramData",alwaysRun = true)
    public void testDataProvider(String caseDetail, int num1, int num2, int expect) {
        Integer sum = MathSolution.Add(num1, num2);
        System.out.println(this);
        assertThat(caseDetail, expect, equalTo(sum));
    }

}

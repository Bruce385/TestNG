package cyc.testng;

import cyc.bruce.utils.MathSolution;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DependencyTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass");
    }

    @Test
    public void testMethod1() {
        Assert.assertEquals(2 + 6, 18);
        System.out.println("testMethod1");
    }

    @Test(dependsOnMethods = "testMethod1")
    public void testMethod2() {
        //int result = test.add(2, 6);
        Assert.assertEquals(2 + 6, 8);
        System.out.println("testMethod2");
    }

    @Test(dependsOnMethods = "testMethod2", alwaysRun = true)
    public void testMethod3() {
        System.out.println("testMethod3");
    }

    @Test
    public void testMethod4() {
        System.out.println("testMethod4");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod运行在每个method之前");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod运行在每个method之后");
    }


    @DataProvider
    public Object[][] paramData() {
        return new Object[][]{
                {"Add 1 + 2", 1, 2, 3},
                {"Add 10 + 20", 10, 20, 300},
        };
    }

    //指定使用哪个DataProvider
    @Test(dataProvider = "paramData")
    public void testMethod1(String caseDetail, int num1, int num2, int expect) {
        Integer sum = MathSolution.Add(num1, num2);
        assertThat(caseDetail, expect, equalTo(sum));
        System.out.println(this + "\t" + Thread.currentThread().getName());
    }

}

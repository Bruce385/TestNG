package cyc.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass类之前打印");
    }

    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("AfterClass类之后打印,id=" + id);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nBeforeMethod方法之后打印出来");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod方法之后打印出来\n");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite测试套件在类运行之前，一个套间里面可以有多个类");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite测试套件在类运行之后");
    }

    //最基本的注解，用来把方法标记为测试的一部分
    @Test(description = "基本注解：用例1")
    public void testCase1() {
        System.out.println("这是测试用例1\t" + this);
    }

    @Test(description = "基本注解：用例2")
    public void testCase2() {
        System.out.println("这是测试用例2\t" + this);
    }

    @Test(description = "基本注解：用例3")
    public void testCase3() {
        System.out.println("这是测试用例3\t" + this);
    }

    @BeforeTest
    public void beforeTest() {
        long id = Thread.currentThread().getId();
        System.out.println("BeforeTest方法之后打印出来,id=" + id);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest方法之后打印出来");
    }


}

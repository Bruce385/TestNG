package cyc.testng.suitecase;

import org.testng.annotations.*;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before cyc.testng.suitecase 运行");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after cyc.testng.suitecase 运行");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest 运行");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest 运行");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass 运行");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass 运行");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod 运行");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod 运行");
    }
}

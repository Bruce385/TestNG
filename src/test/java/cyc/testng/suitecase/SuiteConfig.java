package cyc.testng.suitecase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println();
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
}

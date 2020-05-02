package cyc.testng.testsuite;

import org.testng.annotations.*;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/5/2 16:52
 */
public class TestNGClass2 {
    @BeforeClass
    public void setUp(){
        System.out.println("\nbeforeClass——>>>>>>来自TestNGClass2类");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("afterClass——>>>>>>来自TestNGClass2类");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod——>>>>>>来自TestNGClass2类>>>>beforeMethod");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod——>>>>>>来自TestNGClass2类>>>>afterMethod");
    }
    @Test
    public void testAdd(){
        System.out.println("这是TestNGClass2类中的第一个测试方法------------->>>>>>");
    }
    @Test
    public void testMethod(){
        System.out.println("这是TestNGClass2类中的第二个测试方法------------->>>>>>");
    }

}

package cyc.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Bruce.Chen
 * @version 1.0
 * @date 2020/5/2 13:54
 */
public class ParameterTest {

    @Test
    @Parameters({"name", "age"})  //用parameter注解，传入参数的名称
    public void paramTest(String name, int age) {
        System.out.println("\nname = " + name + "\nage = " + age);
    }
}
package cyc.testng;

import cyc.bruce.utils.MathSolution;
import org.testng.annotations.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SimpleTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class of Simple");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test of Simple");
    }

    @Test
    public void testAdd() {
        Integer sum1 = MathSolution.Add(1, 2);
        assertThat("Add 1 + 2 结果错误", sum1, equalTo(3));
    }

    @Test
    public void testAdd2() {
        Integer sum2 = MathSolution.Add(null, null);
        assertThat("Add null + null 结果错误", sum2, equalTo(null));
    }

    @Test
    public void testAdd3() {
        Integer sum3 = MathSolution.Add(Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertThat("Too Big", sum3, equalTo(null));
    }
}

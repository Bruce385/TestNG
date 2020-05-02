package cyc.testng;

import org.testng.annotations.Test;

public class TimeoutTest {

    int sum = 0;

    @Test(threadPoolSize = 4, invocationCount = 10, timeOut = 4000)
    public synchronized void testTimeout() throws InterruptedException {
        sum++;
        Thread.sleep(300);
        System.out.println("sum=" + sum + "\t所在线程：\t" + Thread.currentThread().getId() + this);
    }
}

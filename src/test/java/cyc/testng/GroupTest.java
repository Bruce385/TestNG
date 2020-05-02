package cyc.testng;

import org.testng.annotations.*;

public class GroupTest {

    @Test//(groups = "server")
    public void test1() {
        System.out.println("这是服务端组的测试方法111\t" + this);
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组的测试方法222\t" + this);
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端组的测试方法333\t" + this);
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端组的测试方法444\t" + this);
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer() {
        System.out.println("这是服务端组运行之前运行的方法!!!!");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer() {
        System.out.println("这是服务端组运行之后运行的方法!!!!");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("这是客户端组运行之前运行的方法!!!!");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient() {
        System.out.println("这是客户端组运行之后运行的方法!!!!");
    }

}

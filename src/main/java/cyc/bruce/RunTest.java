package cyc.bruce;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class RunTest {
    private Response response;

    Map<String, Object> map = new HashMap<String, Object>();
    int statuscode;


    @Test
    public void f() {
        response = given().params(map).get("http://api.douban.com/v2/book/1220562");
        statuscode = response.getStatusCode();
        System.out.println(statuscode);
        if (statuscode != 400) {
            throw new AssertionError("status code is" + statuscode + "by mistake");
        }

//以下的code 是为了打印出来看所有的返回值的。不参与测试过程
        String message = response.jsonPath().getString("msg");
        System.out.println(message);
    }
}

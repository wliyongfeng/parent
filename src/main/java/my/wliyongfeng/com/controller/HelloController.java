package my.wliyongfeng.com.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloController {

    @GET
    public String getMessage() {
        return "Hello World!";
    }
}

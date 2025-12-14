package xyz._18181010.boot_demo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoRestController {

    @Value("${admin.name}")
    private String adminName;

    // exposing '/' to return a string
    @GetMapping("hello")
    public String getMethodName(@RequestParam String name) {
        return new String("Hello " + name + "!\n\t-" + adminName);
    }
    
}

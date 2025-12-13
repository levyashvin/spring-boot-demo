package xyz._18181010.boot_demo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoRestController {

    // exposing '/' to return a string
    @GetMapping("hello")
    public String getMethodName(@RequestParam String name) {
        return new String("Hello " + name + "!");
    }
    
}

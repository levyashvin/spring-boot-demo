package xyz._18181010.boot_demo.rest;

import org.springframework.web.bind.annotation.RestController;

import xyz._18181010.boot_demo.common.BaseClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoRestController {

    // example of autowiring and dependency injection
    private BaseClass derviedObj;

    @Value("${admin.name}")
    private String adminName;

    @Autowired
    DemoRestController(BaseClass obj){
        derviedObj = obj;
    }

    @GetMapping("rand")
    public String randNum() {
        return derviedObj.getData();
    }
    
    

    // exposing '/' to return a string
    @GetMapping("hello")
    public String greetEndpoint(@RequestParam String name) {
        return new String("Hello " + name + "!\n\t-" + adminName);
    }

    // default endpoint
    @GetMapping("/")
    public String defaultEndpoint() {
        return new String("Hello World");
    }
    
}

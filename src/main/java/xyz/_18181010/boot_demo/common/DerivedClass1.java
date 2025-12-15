package xyz._18181010.boot_demo.common;

import org.springframework.stereotype.Component;

@Component
public class DerivedClass1 implements BaseClass{

    @Override
    public String getData(){
        return "random_values";
    }
}

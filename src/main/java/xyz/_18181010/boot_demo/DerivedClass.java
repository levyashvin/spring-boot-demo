package xyz._18181010.boot_demo;

import org.springframework.stereotype.Component;

@Component
public class DerivedClass implements BaseClass{

    @Override
    public String getData(){
        return "random_values";
    }
}

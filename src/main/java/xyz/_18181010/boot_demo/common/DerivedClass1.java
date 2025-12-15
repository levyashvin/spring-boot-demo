package xyz._18181010.boot_demo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class DerivedClass1 implements BaseClass{

    DerivedClass1(){
        System.out.println("DerivedClass1 intantiated");
    }

    @Override
    public String getData(){
        return "random_values";
    }
}

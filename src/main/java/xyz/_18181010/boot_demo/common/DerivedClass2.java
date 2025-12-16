package xyz._18181010.boot_demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DerivedClass2 implements BaseClass{

    DerivedClass2(){
        System.out.println("DerivedClass2 intantiated");
    }

    @Override
    public String getData(){
        return ""+Math.random();
    }
}

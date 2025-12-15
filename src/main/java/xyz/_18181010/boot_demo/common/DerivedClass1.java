package xyz._18181010.boot_demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DerivedClass1 implements BaseClass{

    DerivedClass1(){
        System.out.println("DerivedClass1 intantiated");
    }

    @Override
    public String getData(){
        return "random_values";
    }
}

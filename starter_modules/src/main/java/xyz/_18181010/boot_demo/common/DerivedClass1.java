package xyz._18181010.boot_demo.common;

//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
//@Scope("prototype")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DerivedClass1 implements BaseClass{

    DerivedClass1(){
        System.out.println("DerivedClass1 intantiated");
    }

    // postconstruct for startup tasks
    @PostConstruct
    void doStartUp(){
        System.out.println("starting up "+ getClass().getSimpleName());
    }

    // tasks before bean deletion
    @PreDestroy
    void doCleanUp(){
        System.out.println("cleaning up "+ getClass().getSimpleName());
    }

    @Override
    public String getData(){
        return "random_values";
    }
}

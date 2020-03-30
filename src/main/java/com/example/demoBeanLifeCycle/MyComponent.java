package com.example.demoBeanLifeCycle;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
@Data
@Slf4j
public class MyComponent implements InitializingBean, DisposableBean {


    @Value("${name}")
    private String name;

    public MyComponent(){
        System.out.println("constructor..." + name );
        log.debug("constructor... {}", name);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet..." + name);
        log.debug("afterPropertiesSet... {}", name);
    }

    @PostConstruct
    public void setup(){
        System.out.println("PostConstruct..." + name);
        log.debug("PostConstruct... {}", name);
    }

    public void init() {
        System.out.println("init-method" + name);
    }

    @Override
    public void destroy() {
        System.out.println("destroy." + name);
        log.debug("destroy... {}", name);
    }

    @PreDestroy
    public void predestroy() {
        System.out.println("pre destroy." + name);
        log.debug("pre destroy... {}", name);
    }

    @Override
    public String toString() {
        System.out.println("This is my String.");
        return "This is my String " + name;
    }
}

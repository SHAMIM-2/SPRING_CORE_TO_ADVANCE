package org.example;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Setter
@Getter
@ToString

public class User implements InitializingBean, DisposableBean {
    private int id;
    private String name;
    private int age;


    @Override
    public void destroy() throws Exception {
        System.out.println("Program ended..");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Program stated..");
    }
}

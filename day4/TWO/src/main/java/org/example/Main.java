package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        context.registerShutdownHook();

        User u = context.getBean("shamim", User.class);
        System.out.println(u);
    }
}
package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User u1 = (User) context.getBean("u");
        System.out.println(u1);
        System.out.println(u1.getId());
        System.out.println(u1.getName());
        System.out.println(u1.getAge());

    }
}

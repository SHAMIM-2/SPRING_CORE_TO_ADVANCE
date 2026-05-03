package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        User u = context.getBean("user",User.class);
        System.out.println(u);
        context.close();

    }
}

package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student s1 = (Student)context.getBean("s1");
        System.out.println(s1);

    }
}

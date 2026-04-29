package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Hello h1 = (Hello) context.getBean("hello");
        h1.helloPrint();
    }
}

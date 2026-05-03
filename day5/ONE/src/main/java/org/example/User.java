package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private int id;
    private String name;
    private String email;


    @PostConstruct
    public void init(){
        System.out.println("program stated..");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Program Destroy...");
    }
}

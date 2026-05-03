package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private int id;
    private String name;

    public void init(){
        System.out.println("Program Started...");
    }

    public void destroy(){
        System.out.println("Program ending...");
    }
}

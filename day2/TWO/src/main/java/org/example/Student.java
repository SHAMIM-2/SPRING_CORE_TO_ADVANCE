package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Student {
    private double id;
    private String name;

    public void init(){
        System.out.println("Init this code ...");
    }

    public void destroy(){
        System.out.println("Destroy this code ..");
    }
}

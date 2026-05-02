package org.example;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String name;
    private int age;
}

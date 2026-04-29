package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
}
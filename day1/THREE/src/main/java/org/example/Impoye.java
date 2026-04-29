package org.example;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Impoye {
    private String name;
    private List<String> phone;
    private Set<String> addresses;
    private Map<String,String> course;
}

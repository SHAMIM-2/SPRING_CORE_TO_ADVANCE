package org.example;

import org.example.Address;

public class Student {
    private String id;
    private String name;
    private int age;
    private Address address;

    // Setter
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(Address address){   // ✅ FIX
        this.address = address;
    }

    // Getter
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Address getAddress(){   // ✅ FIX
        return address;
    }

    @Override
    public String toString(){
        return "id=" + id + " name=" + name + " age=" + age + " address=" + address;
    }
}

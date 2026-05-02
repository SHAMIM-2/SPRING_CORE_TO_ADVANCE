package org.example;

import java.util.List;

public class Address {
    private List<String> home;

    public void setHome(List<String> home){
        this.home = home;

    }
    public List<String> getHome(){   // better naming
        return home;
    }
    @Override
    public String toString(){
        return home.toString();   // ✅ main fix
    }
}

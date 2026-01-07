package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow";
    }
    public Cat(String name, Date birthdate) {
        super(name, birthDate);
    }

    @Override
    public void Pet() {
        
    }
}

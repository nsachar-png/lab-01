package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public void Pet() {

    }
}
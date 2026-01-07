package com.example.petshop;

import java.Util.Date;
public abstract class Pet {
    Private String name;
    Private Date birthDate;

    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date():
    }


    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
//generated code
    public Private getString() {
        return String;
    }

    public void setString(Private string) {
        String = string;
    }

    public Private getDate() {
        return Date;
    }

    public void setDate(Private date) {
        Date = date;
    }
    public abstract String speak();
}

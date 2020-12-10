package ru.mirea.inbo0519.pr12;
import java.util.*;

class Person {
    private String name;
    private String secondName;
    private String surName;

    public Person(String name, String secondName, String surName) {
        this.name = name;
        this.secondName = secondName;
        this.surName = surName;
    }

    public String fio() {
        return String.format("%s %.1s. %.1s.", secondName, name, surName);
    }
}

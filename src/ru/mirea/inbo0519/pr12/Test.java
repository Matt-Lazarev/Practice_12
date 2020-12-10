package ru.mirea.inbo0519.pr12;

import java.util.*;

public class Test {
    public static void main(String[] args){
        Person person = new Person("Ivan","Ivanov","Ivanovich");
        System.out.println(person.fio());

        Address address = new Address("Russia, Moscow, Moscow, Oktyabrskaya 19, 2, 40");
        System.out.println(address);

        List<String> shirts = new ArrayList<>();
        shirts.add("01,Polo, Black, XL");
        shirts.add("02,Polo, Black, L");
        shirts.add("03, Polo Shirt, Blue, XL");
        shirts.add("04, Polo Shirt, Blue, M");

        for(int i=0; i<shirts.size(); i++)
            System.out.println(shirts.get(i));

        System.out.println(new PhoneNumber("+79999999999"));

        Last last = new Last("СалюТ Оливье Золото елка ас");
        System.out.println(last);
    }
}

package ru.mirea.inbo0519.pr12;

import java.util.*;

class Shirt {
    private String art;
    private String type;
    private String color;
    private String size;

    public Shirt(String s) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(s.split(",")));
        art = arrayList.get(0);
        type = arrayList.get(1);
        color = arrayList.get(2);
        size = arrayList.get(3);
    }

    public String toString(){
        return "Артикул: " + art + ", Наименование:" + type + ", Цвет:" + color + ", Размер:" + size;
    }
}

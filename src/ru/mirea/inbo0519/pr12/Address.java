package ru.mirea.inbo0519.pr12;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String building;
    private String korpus;
    private String flat;

    public Address(String address){
        this.setAddress(address);
    }

    public void setAddress(String address) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(address);
        ArrayList<String> words = new ArrayList<>();

        while (matcher.find()) {
            words.add(matcher.group().toLowerCase());
        }

        if (words.size() < 6){
            System.out.println("Неверный адрес");
            return;
        }
        country = words.get(0);
        region = words.get(1);
        city = words.get(2);
        street = words.get(3);
        building = words.get(4);
        korpus = words.get(5);
        flat = words.get(6);
    }

    public String toString(){
        return "Страна: " + country + ", Регион: " + region + ", Город: " + city + ", Улица: " + street + ", Дом: " + building + ", Корпус: " + korpus + ", Квартира: " + flat;
    }
}

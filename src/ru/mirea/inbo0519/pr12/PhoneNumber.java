package ru.mirea.inbo0519.pr12;
import java.util.*;

class PhoneNumber {
    private int code;
    private long number;

    public PhoneNumber(String numbers) {
        if (numbers.charAt(0) != '+') {
            code = 7;
            this.number = Long.parseLong(numbers.substring(1));
        } else {
            code = Integer.parseInt(String.valueOf(numbers.charAt(1)));
            this.number = Long.parseLong(numbers.substring(2));
        }
    }

    public String toString(){
        return String.format("+%d (%d) %d-%d-%d", code, number / 10000000, number % 10000000 / 10000, number % 10000 / 100, number % 100);
    }
}

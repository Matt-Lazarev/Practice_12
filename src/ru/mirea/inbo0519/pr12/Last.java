package ru.mirea.inbo0519.pr12;
import java.util.*;

class Last {
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> newList;
    public Last(String string) {
        list.addAll(Arrays.asList(string.split("\\s")));
        newList = function();
    }

    public ArrayList<String> function() {
        ArrayList<String> current;
        for (int i = 0; i < list.size(); i++) {
            current = new ArrayList<>();
            ArrayList<String> res = getStrings(list, current, i);
            if (res != null) return res;
        }
        return null;
    }

    public boolean check (ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (Character.toLowerCase(arrayList.get(i).charAt(arrayList.get(i).length() - 1)) != Character.toLowerCase(arrayList.get(i + 1).charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> functionp2(ArrayList<String> left,ArrayList<String> current) {
        if (left.size() == 0 && check(current)) {
            return current;
        }
        ArrayList<String> current1;
        for (int i = 0; i < left.size(); i++) {
            current1 = new ArrayList<>(current);
            ArrayList<String> res = getStrings(left, current1, i);
            if (res != null) return res;
        }
        return null;
    }

    private ArrayList<String> getStrings(ArrayList<String> left, ArrayList<String> current1, int i) {
        ArrayList<String> left1;
        ArrayList<String> res;
        current1.add(left.get(i));
        left1 = new ArrayList<>(left);
        left1.remove(i);
        res = functionp2(left1, current1);
        if (res != null && check(res)) {
            return res;
        }
        return null;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : newList) {
            stringBuilder.append(s).append(" ");
        }
        return String.valueOf(stringBuilder);
    }
}

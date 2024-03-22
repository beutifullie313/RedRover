package Lessons.Lesson16InterfaceGenerics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Interfaces {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1, -34, 0, 47, -6, 873);
        System.out.println(findMax(ints));
        System.out.println(findMax(Collections.emptyList()));
        System.out.println(findMax(List.of(999)));



    }

    static Integer findUltimate(List<Integer> elements, NumbersComparator comparator){
    if (elements.size() == 0) return null;
        int champion = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (comparator.compare(elements.get(i), champion) > 0) {
                champion = elements.get(i);
            }
        }
        return champion;
    }

    static Integer findMax(List<Integer> elements) {
        return findUltimate(elements, NumbersComparator.MORE);
    }


        //BEFORE WE CREATED A GENERIC METHOD:
//    static Integer findMax(List<Integer> elements) {
//        if (elements.size() == 0) return null;
//        int champion = elements.get(0);
//        for (int i = 1; i < elements.size(); i++) {
//            if (elements.get(i) > champion) {
//                champion = elements.get(i);
//            }
//        }
//        return champion;
//    }

    static Integer findMin(List<Integer> elements) {
        if (elements.size() == 0) return null;
        int champion = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i) < champion) {
                champion = elements.get(i);
            }
        }
        return champion;
    }

    static String findLonges(List<String> elements){
        if (elements.isEmpty()) return null;
        String champion = elements.get(0);
        for (int i = 1; i < elements.size(); i++) {
            if(elements.get(i).length() > champion.length()) {
                champion = elements.get(i);
            }
        }
        return champion;
    }
}

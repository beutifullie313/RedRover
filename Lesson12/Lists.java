package Lessons.Lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        String [] stringArray = {"a", "b"}; // = List <String> myList

        List <String> myList = new ArrayList <String>();
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        myList.add("dd");
        myList.add("ee");
        myList.add("x");

//        myList.add(12);
//        myList.add(new DoNotExtend());

        System.out.println(myList);
        System.out.println(myList.get(2));
        myList.remove(2);
        System.out.println(myList);
        System.out.println(myList.size());
//        myList.add (2; "GG");
//        myList.addAll(List.of("x","y", "z"));

        System.out.println(myList.contains("x"));//true
        System.out.println(myList.contains("xxxxxxx"));//false

//        List<String> myInts = new ArrayList(100);
//        Collections.fill(myInts,-100);
//        System.out.println(myInts);
//
////        String [] stringArray = new String[] {"dsf", "asd"};
//
//        List<String> immutable = List.of("one", "two", "three");
//        System.out.println(immutable.get(0));
//        System.out.println(immutable);
////        immutable.add("xxxx");
//
//        // How to select from list:
//
//        List<Integer> ints = List.of(1,4,67,873,-3434, -1,0);
//        for (int chislo: ints){//checl all elements of a list
//            if(chislo < 0){ //if a number less than 0 (we need negative numbers)
//                System.out.println(chislo); //-3434,-1
//            }
//        }




    }
}

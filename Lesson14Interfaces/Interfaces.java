package Lessons.Lesson14Interfaces;

import Lessons.Lesson11.Grade;

import java.util.Collections;
import java.util.List;

public class Interfaces {

    public static void main(String[] args) {

//        List<String> strings = Collections.nCopies(10, "--");//[--, --, --, --, --, --, --, --, --, --]
//        System.out.println(strings);
//        List<Integer> ints = Collections.nCopies(3,0);// 3 ints filled with zeros
//        System.out.println(ints);

        List<Grade> grades = Collections.nCopies(5, new Grade(1));
        System.out.println(grades); //@7229724f (for all!!!) => needed method  return String.valueOf(grade); //
        grades.get(0).setGrade(5); //call 0 element and make it equal 5 => replaces all [5, 5, 5, 5, 5] because it's all the same element
        System.out.println(grades);
    }

        static class Grade{
            private int grade;

            public Grade(int grade){ //method
                this.grade = grade;
            }

            public int getGrade(){
                return grade;
            }

            public int setGrade(int grade) {
                this.grade = grade;
                return grade;
            }
            @Override
            public String toString(){
                return String.valueOf(grade); //[1, 1, 1, 1, 1]
            }
        }
    }

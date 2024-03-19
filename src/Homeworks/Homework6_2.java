package Homeworks;

public class Homework6_2 {

    //        Необходимо написать 4 метода:
//        сложение 2х чисел
//        вычитание 2х чисел
//        умножение 2х чисел
//        деление 2х чисел
    public static int getSum (int a, int b) {
        return a + b;
    }
//

    public static int getSubtr (int a, int b) {
        return a - b;
    }

    public static int getMulti (int a, int b) {
        return a * b;
    }


    public static double getDiv (int a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(getSum (2,6));
        System.out.println(getSubtr (2,6));
        System.out.println(getMulti (2,6));
        System.out.println(getDiv (2,6));
    }

    }

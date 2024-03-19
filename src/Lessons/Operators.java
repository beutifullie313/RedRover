package Lessons;

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int c = 20;
        int d = -50;

//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a == b);
//        System.out.println(b == c);
//        System.out.print("b > a and c > a:");
//        System.out.println(b > a && c > a);

        if (c > 0 || d > 0) {
            System.out.println("It's ok");
        } else {
            System.out.println("One of the numbers is negative");
        }
    }
}

package Lessons.Lesson13;


public class Lesson13 {

    public static int getSum(int a, int b){
        return a + b;
    }

    //UNITTEST:

    public static void testGetSum(){
        System.out.println(getSum(0,0) == 0);
        System.out.println(getSum(5,5) == 10);
        System.out.println(getSum(1000000000,1000000000) == 2000000000);
        System.out.println(getSum(-5,-5) == -10);
    }

    public static void main(String[] args) {

        testGetSum();

    }
}

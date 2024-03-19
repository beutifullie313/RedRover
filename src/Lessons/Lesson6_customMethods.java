package Lessons;

public class Lesson6_customMethods {
    //    public static void printString(String str){
//        System.out.println(str);
//
// METHOD RETURNS NOTHING: VOID
//
//        public static void getSum(int a, int b) {
//            System.out.println(a + b);
//        }
//
//        public static void main(String[] args) {
//
//            getSum(3,7);
//            getSum(5, 4);

//    METHOD WHICH RETURNS SMTH: INSTEAD OF VOID INT, instead of sout RETURN
//    public static int getSum(int a, int b) {
//        return(a + b);
//    }
//
//    public static void main(String[] args) {
//
//        int x = getSum(3,7);
//        System.out.println(x);
//        System.out.println(getSum(5,4));


//    public static int strCount(String str, char letter){
//
//        int count = 0;
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == letter){
//                count++;
//            }
//        }
//        return count;
//    }

    public static void main(String[] args){

        int a = 10;
        int b = 1;

        String s = "Hello world";
        String str = "Yuliya";

//         COMPARISON OF VARIABLES OF DIFFERENT TYPES:
        if (s.equals(str)) {
            System.out.println("a == b");
        }


    }
}
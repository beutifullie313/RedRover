package codewars;

public class underdogs {

//    Задача 3
////    Написать метод, который распечатывает  последовательность чисел в промежутке [12, 13] с шагом 0.1

//    public static void numbers (int num1, int num2){
////        for (int i = num1*10; i <= num2*10; i ++){//while it's not 13
////            System.out.println(i*1.0/10); //
//
//
//        for (double i = num1; i < num2; i += 0.1) {
//            System.out.printf("%.1f%n", i);  //formatting
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        numbers(12,13);
//    }
//}


//    Задача 1
//    Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 к
//    оп”.

    public static void price(double num) {

        int i = (int) num; // turn double into int: 10.75 => 10

        int y = (int) ((num - i) * 100); // turn ostatok ot num and multiply to 100 to get 07 => 70
        System.out.println(i + "rub." + y + "kop.");


    }

    public static void main(String[] args) {


        price(1022.232);
    }
}




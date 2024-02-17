public class Homework_3 {
    public static void main(String[] args) {
//        Задача №1

// a == b - если переменные равны
//a < b - если переменная a меньше b
//a > b - если переменная b меньше a

//        int a = 30;
//        int b = 20;
////
//        if (a == b) {
//            System.out.println("a equals b");
//        }else if (a < b){
//        System.out.println("a less than b");
//        } else if (a > b) {
//            System.out.println("a more than b");
//        } else {
//            System.out.println("No result");
//        }


//        Задача №2

//maybe a and b are even - если сумма переменных четная
//some variable is odd - если сумма переменных нечетная

//        int a = 30;
//        int b = 20;
//
//        if ((a + b) % 2 == 0) {
//            System.out.println("maybe a and b are even");
//        } else {
//                System.out.println("some variable is odd");
//            }


//        Задача №3
//
// больше 10 - если переменная больше 10
//меньше 100 - если переменная меньше 100
//результат деления на 2 больше 20 - если это соответствует истине
//значение переменной между 5 и 40 включительно - если это правда
//значение переменной меньше 5 или больше 40 - если предыдущие условие ложное

        int random_number = 33;

        if (random_number > 10){
                    System.out.println("больше 10");
                } if (random_number < 100){
                    System.out.println("меньше 100");
                } if ((random_number * 1.0 / 2) > 20){
                    System.out.println("результат деления на 2 больше 20");
                } if (5 <= random_number && random_number <= 40){
                    System.out.println("значение переменной между 5 и 40 включительно");
                } if (random_number <5 || random_number > 40 ){
            System.out.println("значение переменной меньше 5 или больше 40");
        }









    }
}

public class Homework5_1 {
    public static void main(String[] args) {

//        +Задача №1
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//////        необходимо вывести сумму всех значений массива.
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//
//        System.out.println(sum);


//
//
//        +Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        System.out.println(max);
//
//               + Задача №3
//
//        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6}; // ARRAY
////        необходимо вывести минимальное значение массива.
        int min = Integer.MAX_VALUE; // START VARIABLE WITH max number in the world
        for (int i = 0; i < array.length; i++) { // START ITERATION WITH 0 INDEX, WHILE IT'S LESS THEN ARRAY' LENGTH, EVERY STEP + 1
            if (array[i] < min) { // if any index of the array is less than starting variable 'min'
                min = array[i]; // then memorize it
            }
        }
        System.out.println(min); //print the result of min when the array ends
//
//
//               + Задача №4
//
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
////        необходимо вывести среднее арифметическое всех значений массива.
//
//        double sum = 0; // if average is not int!
//        int length = array.length;
//
//        for (int i = 0; i < array.length; i++){
//           sum += array[i];
//
//        }
//        int average = sum/length;
//        System.out.println(average);
//
//
//                + Задача №5
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
////        необходимо вывести сумму элементов массива.
//
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length; j++)
//                sum += array[i][j];
//        }
////
//        System.out.println(sum);
//
//
//               + Задача №6
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
////        необходимо вывести максимальное значение массива.
//
//
//       int max = Integer.MIN_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++)
//            if (array[i][j] > max) {
//                max = array[i][j];
//            }
//        }
//        System.out.println(max);

//        Задача №7
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
////        необходимо вывести количество элементов в массиве.

        // OPTION 1:

//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                count++;
//
//            }
//        }
//        System.out.println(count);

        // OPTION 2:
//
//        int count = 0;
////
//        for (int i = 0; i < array.length; i++) {
//                count += array[i].length;
//
//            }
//        System.out.println(count);
    }
}

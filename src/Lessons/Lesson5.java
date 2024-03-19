package Lessons;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {
//        TO FIND MAXIMUM NUMBER!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        int[] arr = {-11,-5,-8,-3,-6,-9};
//
//// USE ANY ELEMENT OF ARRAY AS START usually it's 0:
//
//        int maximum_number = arr[0];
//
//        for (int i = 0; i < arr.length; i = i + 1){
//
//            if (arr[i] > maximum_number) {
////                remember the number:
//                maximum_number = arr[i];
//            }
//
//        }
//        System.out.println(maximum_number);
//    }
//}

//        int[] arr = {-11,-5,-8,-3,-6,-9};
//
//// MINIMAL NUMBER AS INTEGER
//
//        int maximum_number = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr.length; i = i + 1){
//
//            if (arr[i] > maximum_number) {
////                remember the number:
//                maximum_number = arr[i];
//            }
//
//        }
//        System.out.println(maximum_number);

//        int[] arr = {-11,-5,-8,-3,-6,-9};
//
//// FIND MINIMAL NUMBER
//
//        int minimum_number = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.length; i = i + 1){
//
//            if (arr[i] < minimum_number) {
////                remember the number:
//                minimum_number = arr[i];
//            }
//
//        }
//        System.out.println(minimum_number);

//        int[] arr = {-11,-5,-8,-3,-6,-9};
//
//// FIND SUM OF ALL ELEMENTS IN ARRAY
//
//
//
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i = i + 1){
//            sum += arr[i];
//
//        }
//        System.out.println(sum);

//        int[][] arr = {
//                {11, 6, 9},
//                {8, 3, 6, 9},
//                {5, 8, 3}
//        };
//        TO PRINT THIRD ELEMENT IN SECOND ARRAY
//        System.out.println(arr [2][3]);
//        System.out.println(arr[i][3]);

// 2D ARRAYS:


//        int min = Integer.MAX_VALUE;
////first cycle is for all 2d array: every enclosed element(array)
//        for (int i = 0; i < arr.length; i++) {
////            second loop is for every array and each element in each array
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] < min) {
//                    min = arr[i][j];
//                }
//
//
//            }
//            System.out.println(min);

//        BREAK AND CONTINUE

//        int[] arr = {11, 6, 9};
//
//        for (int i = 0; i < arr.length; i++) {
//                if (arr[i] % 5 == 0){
//                    continue;
//                }
//            System.out.println(arr[i]);
//        }

//        int a = 10;
////CREATED A NEW VARIABLE:
//        int b = a;
//        b = 20;
//        System.out.println(a);
//
//        int[] arr1 = {4,5};
////        NOT CREATED A NEW ARRAY< JUST A LINK TO ARRAY 1:
//        int[] arr2 = arr1;
//        arr2[0] = 9;
//
//        System.out.println(Arrays.toString(arr1));

        Integer A = 1000;
        Integer B = 1000;

        System.out.println(A == B);

        int a = 1000;
        int b = 1000;

        System.out.println(a == b);
    }
}

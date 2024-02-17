import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 2;
//
//
//        if (a > b) {
//            System.out.println('a');
//        }
//        {
//            int c = a + b;
//            System.out.println(c);
//        }
//        int c = 20;
//
//        System.out.println(c);
//        int i = 0;
//        if (i < 5) {
//            System.out.println("!!!");
//        }

//        for (int i = -1; i < 5 ; i = i + 1) {
//            System.out.println(i);
//        }
//        as a result we have 2 iterations:
//        for (int i = 0; i < 5 ; i = i + 1) {
//            System.out.println(i);
//        }

//       Cycle WHILE:
//        int a = 0;
//        while (a < 5) {
//            System.out.println(a > 5);
//            a = a + 1;
//        }

//        Data structures: ARRAYS:


        int[] arr = {15};

        arr[0] = 5;
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));

//        Array LENGTH
//
//        System.out.println( arr.length );

//        int[] arr = {10, 20, 30, 15};
////
////        int a = arr[0];
////        arr[0] = arr[3];
////        arr[3] = a;
////        System.out.println(Arrays.toString(arr));
//
//
//        for (int i = 0; i < arr.length; i = i + 1) {
//            System.out.println(arr[i]);

//        CREATE A NEW ARRAY WITH 99 ELEMENTS:
//        int[] arr = new int[100];

//        for (int i = 0; i < arr.length; i = i + 1) {
//            arr[i] = i;
//
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr = {2,7,8};
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 10;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}

package Homeworks;

import java.util.Arrays;

public class changePlacestask {
    public static void main(String[] args) {

        // OPTION 1: TO CREATE A NEW ARRAY
//
//        int[] arr = {1,2,3,4,5};
//
//        int[] result = new int[arr.length];
//
//        for(int i = 0; i < arr.length; i++){
//            result[i] = arr[arr.length - i - 1];
//        }
//        System.out.println(Arrays.toString(result));

        // OPTION 2: USE THE SAME ARRAY:

        int[] arr = {1,2,3,4,5};

        for(int i = 0; i < arr.length / 2; i++){ //because we go only until the half of the array
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i -1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

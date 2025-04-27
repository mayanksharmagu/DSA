package array;

import java.util.Arrays;

public class builtinmethods {
    public static void main(String[] args) {
        int[] arr = { 30,40,10,23,89,34};
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]+" ");
//        for each loop
        for(int x : arr){
            System.out.print(x+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

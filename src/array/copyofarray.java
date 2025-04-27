package array;

import java.util.Arrays;

public class copyofarray {
    public static void main(String[] args) {
        int [] arr = {30,10,40,23,89,34};
        for( int x: arr){ //for each loop
            System.out.print(x+" ");
        }
        System.out.println();
//        int [] nums = arr; // shallow copy
//        nums[0] = 70;
//        System.out.print(arr[0]);
        //deep copy
        int[] brr = Arrays.copyOf(arr,arr.length);
//        brr[0] = 70;
        System.out.println(arr[0]);
    }
}

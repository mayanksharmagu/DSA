package basicSorting;

import java.util.Arrays;

public class builtinsort {
    public static void main(String[] args) {
        int[] arr = {7,2,5,6,4};
        for(int ele : arr){
            System.out.print  (ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}

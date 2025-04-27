package AdvanceSorting;

public class KthLargestElement {
    static int ans;

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int lo, int hi){
        int pivot = arr[hi]; // use last element as pivot
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, hi); // place pivot in correct position
        return i;
    }

    public static void quickselect(int[] arr, int lo, int hi, int k){
        if (lo <= hi) {
            int idx = partition(arr, lo, hi);

            if (idx == k) {
                ans = arr[idx];
                return;
            } else if (k < idx) {
                quickselect(arr, lo, idx - 1, k);
            } else {
                quickselect(arr, idx + 1, hi, k);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 1, 2, 6, 5, 8};
        int n = arr.length;
        int k = 3; // 3rd largest
        print(arr);
        ans = -1;

        // To find kth largest, convert it to (n - k)th smallest
        quickselect(arr, 0, n - 1, n - k);

        System.out.println("The " + k + "rd largest element is: " + ans);
    }
}

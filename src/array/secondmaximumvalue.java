package array;

public class secondmaximumvalue {
    public static void main(String[] args) {
        int [] arr = {10,54,67,30,12,57 };
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]> mx) mx = arr[i];
        }
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != mx) {
                min = Math.max(min, arr[i]);
            }
        }
        System.out.println(mx);
            System.out.println(min);
    }
}

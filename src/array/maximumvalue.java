package array;

public class maximumvalue {
    public static void main(String[] args) {
        int [] arr = {10,54,67,30,12,57 };
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]> mx) mx = arr[i];
        }
        System.out.println(mx);
    }
}

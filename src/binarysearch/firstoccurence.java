import java.util.Arrays;

public class firstoccurence {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6,6,6, 44, 335, 543, 355};
        Arrays.sort(arr);
        int n = arr.length;
        int target = 6;
        int lb = -1;
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                lb = mid;
                hi = mid - 1;
//                lo = mid+1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(lb);
    }
}

package basicSorting;

public class checkifarrayissortedornot {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,3};
        int n= arr.length;
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        if (flag == true) System.out.println("Sorted");
        else System.out.println("Unsorted");
    }
}

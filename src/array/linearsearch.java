package array;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element : ");
        int x = sc.nextInt();
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }
        }
        if(flag = true)  System.out.println("Element Found");
        else  System.out.println("Element not Found");
    }
}

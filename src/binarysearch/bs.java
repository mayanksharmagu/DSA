package binarysearch;

public class bs {
    public static void main(String[] args) {
        int [] arr= {10,23,4,5,6,44,335,543,355,3};
        int n = arr.length;
        int lo = 0,hi= n-1;
        int target = 46;
        boolean flag = false;
        while(lo<=hi){
            int mid = (lo+hi/2);
            if (arr[mid]==target){
                flag = true;
                break;
            }
            else if (arr[mid]>target) hi = mid-1;
            else  lo = mid+1;
        }
        if (flag == true ) System.out.println("target present");
        else System.out.println("Target not present");
    }
}

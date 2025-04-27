package binarysearch;

public class lowerbound {
    public static void main(String[] args) {
        int [] arr= {4,5,6,44,335,543,355};
        int n = arr.length;
        int target = 6;
        int lb = n;
        int lo = 0,hi =n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if (arr[mid]>=target){
                lb = Math.min(lb,mid);
                hi = mid-1;
            }
            else lo = mid+1;
        }
        System.out.println(lb);
    }
}

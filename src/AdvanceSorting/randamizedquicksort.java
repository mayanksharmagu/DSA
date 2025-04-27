package AdvanceSorting;

public class randamizedquicksort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int[] arr, int lo , int hi){
        int mid =(lo+hi)/2;
        int pivot = arr[mid] , pivotidx = mid;
        int smallercount = 0;
        for (int i = lo+1; i <hi ; i++) {
            if(i ==mid) continue;
            if(arr[i] <= pivot) smallercount++;
        }
        int correctIdx = lo + smallercount;
        //swapp arrr[pivotidx] & arr[correctIdx]
        swap(arr, pivotidx,correctIdx);
        //partition
        int i = lo, j = hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i] <= pivot) i++;
            else if(arr[j]> pivot) j--;
            else if (arr[i]>pivot && arr[j]>pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr, int lo , int hi){
        if(lo>=hi) return;
        // pivot (arr[l0] ko sahi jagah rakho
        //& left part me <= pivot
        int idx =  partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr, idx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr= {4,9,7,1,2,3,6,5,8};
        int n= arr.length;
        print(arr);
        quicksort(arr,0,n-1);
        print(arr);
    }
}

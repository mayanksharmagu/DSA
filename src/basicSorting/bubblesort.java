package basicSorting;

public class bubblesort {
    public static void print (int[]arr){
        for(int ele : arr){
            System.out.print (ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr= {5,2,1,4,3};
        int n= arr.length;
        print(arr);
        // bubbble sort -1
//        for (int j = 0; j <=n-1; j++) {
//            for (int i = 0; i < n-1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
        // bubbble sort -2
//        for (int j = 0; j <=n-1; j++) {
//            for (int i = 0; i < n-1-j; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
        // bubbble sort - optimised
        for(int x = 0; x <n-1; x++){
        boolean flag = true;
            for (int i = 0; i < n-1-x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;
                }
            }
                if (flag == true) ;
                break;
            }
        print(arr);
    }
}

package basicSorting;

public class transformArray {
    public static void print(int [] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr= {40,12,34,1000,57,23};
        int n = arr.length;
        print(arr);
        int x =0;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if(arr[j] <min && arr[j]>0){
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        print(arr);
    }
}

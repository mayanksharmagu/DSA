package recursion;

public class arraytraversal {
    public static void print (int i,int[]arr){
        if(i== arr.length) return;
        System.out.print((arr[i]+" "));
        print (i+1,arr);
    }
    public static void main(String[] args) {
        int[] arr ={4,3,22,5,6,53,32};
       print(0,arr);
    }
}

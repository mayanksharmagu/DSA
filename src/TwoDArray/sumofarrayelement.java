package TwoDArray;

public class sumofarrayelement {
    public static void main(String[] args) {
        int[][]arr = {{1,5,6},{6,4,7},{3,5,6}};
        int sum = 0;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
               sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}

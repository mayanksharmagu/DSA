package TwoDArray;

public class transformIntoTranspose {
    public static void print(int[][] arr) {
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{4, 2, 7}, {5, 4, 9}, {3, 6, 8}};
        int m = arr.length, n = arr[0].length;
        print(arr);
        System.out.println();
        //transposing
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
             int temp = arr[i][j];
             arr[i][j] = arr[j][i];
             arr[j][i] = temp;
            }
        }
        print(arr);
        //rotate  each row
        System.out.println();
        for (int i = 0; i < m; i++) {
           int a =0 , b = m-1;
           //swap
            while (a<b){
            int temp = arr[i][a];
            arr[i][a] = arr[i][b];
            arr[i][b] = temp;
            a++;
            b--;
            }
        }
        print(arr);
    }
}
